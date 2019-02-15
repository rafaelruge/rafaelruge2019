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
    public class FrontADMINISTRADORController : Controller
    {
        // GET: Administrador
        public ActionResult Index()
        {
            IEnumerable<FrontADMINISTRADOR> empList;
            HttpResponseMessage response = GlobalVariables.WedApiClient.GetAsync("Administrador").Result;
            empList = response.Content.ReadAsAsync<IEnumerable<FrontADMINISTRADOR>>().Result;
            return View(empList);


        }

        public ActionResult AddOrEdit(int id = 0)
        {
            if (id == 0)
                return View(new FrontADMINISTRADOR());
            else
            {
                HttpResponseMessage response = GlobalVariables.WedApiClient.GetAsync("Administrador/" + id.ToString()).Result;
                return View(response.Content.ReadAsAsync<FrontADMINISTRADOR>().Result);
            }
        }
        [HttpPost]

        public ActionResult AddOrEdit(FrontADMINISTRADOR emp)
        {
            if (emp.id == 0)
            {
                HttpResponseMessage response = GlobalVariables.WedApiClient.PostAsJsonAsync("Administrador", emp).Result;
                TempData["SuccesMessage"] = "Saved Succesfully";
            }
            else
            {

                HttpResponseMessage response = GlobalVariables.WedApiClient.PutAsJsonAsync("Administrador/" + emp.id, emp).Result;
                TempData["SuccesMessage"] = "Update Succesfully";
            }

            return RedirectToAction("Index");
        }
        public ActionResult Delete(int id)
        {
            HttpResponseMessage response = GlobalVariables.WedApiClient.DeleteAsync("Administrador/" + id.ToString()).Result;
            TempData["SuccesMessage"] = "Delete Succesfully";
            return RedirectToAction("Index");
        }

    }
}

