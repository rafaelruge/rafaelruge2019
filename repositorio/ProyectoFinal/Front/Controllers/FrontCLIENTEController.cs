using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Threading.Tasks;
using System.Net;
using System.Web;
using System.Web.Mvc;
using Front.Models;
using System.Net.Http;

namespace Front.Controllers
{
    public class FrontCLIENTEController : Controller
    {
        // GET: Futbolistas
        public ActionResult Index()
        {
            IEnumerable<FrontCLIENTE> empList;
            HttpResponseMessage response = GlobalVariables.WedApiClient.GetAsync("Cliente").Result;
            empList = response.Content.ReadAsAsync<IEnumerable<FrontCLIENTE>>().Result;
            return View(empList);

        }


        public ActionResult AddOrEdit(int id = 0)
        {
            if (id == 0)
                return View(new FrontCLIENTE());
            else
            {
                HttpResponseMessage response = GlobalVariables.WedApiClient.GetAsync("Cliente/" + id.ToString()).Result;
                return View(response.Content.ReadAsAsync<FrontCLIENTE>().Result);
            }
        }
        [HttpPost]

        public ActionResult AddOrEdit(FrontCLIENTE emp)
        {
            if (emp.id == 0)
            {
                HttpResponseMessage response = GlobalVariables.WedApiClient.PostAsJsonAsync("Cliente", emp).Result;
                TempData["SuccesMessage"] = "Saved Succesfully";
            }
            else
            {
                HttpResponseMessage response = GlobalVariables.WedApiClient.PutAsJsonAsync("Cliente/" + emp.id, emp).Result;
                TempData["SuccesMessage"] = "Update Succesfully";

            }
            return RedirectToAction("Index");
        }
        public ActionResult Delete(int id)
        {
            HttpResponseMessage response = GlobalVariables.WedApiClient.DeleteAsync("Cliente/" + id.ToString()).Result;
            TempData["SuccesMessage"] = "Delete Succesfully";
            return RedirectToAction("Index");
        }

    }
}
