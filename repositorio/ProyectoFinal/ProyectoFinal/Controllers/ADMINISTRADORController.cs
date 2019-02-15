using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using ProyectoFinal.Models;

namespace ProyectoFinal.Controllers
{
    [Authorize(Users = "admin@gmail.com")]
    public class ADMINISTRADORController : Controller
        
    {
        private contextosProyec db = new contextosProyec();

        // GET: ADMINISTRADOR
        public ActionResult Index()
        {
            return View(db.ADMINISTRADOR.ToList());
        }

        // GET: ADMINISTRADOR/Details/5
        public ActionResult Details(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            ADMINISTRADOR aDMINISTRADOR = db.ADMINISTRADOR.Find(id);
            if (aDMINISTRADOR == null)
            {
                return HttpNotFound();
            }
            return View(aDMINISTRADOR);
        }

        // GET: ADMINISTRADOR/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: ADMINISTRADOR/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "ID_ADMINISTRADOR,NOMBRE_ADMINISTRADOR,APELLIDO_ADMINISTRADOR,CORREO_ADMINISTRADOR")] ADMINISTRADOR aDMINISTRADOR)
        {
            if (ModelState.IsValid)
            {
                db.ADMINISTRADOR.Add(aDMINISTRADOR);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(aDMINISTRADOR);
        }

        // GET: ADMINISTRADOR/Edit/5
        public ActionResult Edit(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            ADMINISTRADOR aDMINISTRADOR = db.ADMINISTRADOR.Find(id);
            if (aDMINISTRADOR == null)
            {
                return HttpNotFound();
            }
            return View(aDMINISTRADOR);
        }

        // POST: ADMINISTRADOR/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "ID_ADMINISTRADOR,NOMBRE_ADMINISTRADOR,APELLIDO_ADMINISTRADOR,CORREO_ADMINISTRADOR")] ADMINISTRADOR aDMINISTRADOR)
        {
            if (ModelState.IsValid)
            {
                db.Entry(aDMINISTRADOR).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(aDMINISTRADOR);
        }

        // GET: ADMINISTRADOR/Delete/5
        public ActionResult Delete(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            ADMINISTRADOR aDMINISTRADOR = db.ADMINISTRADOR.Find(id);
            if (aDMINISTRADOR == null)
            {
                return HttpNotFound();
            }
            return View(aDMINISTRADOR);
        }

        // POST: ADMINISTRADOR/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(decimal id)
        {
            ADMINISTRADOR aDMINISTRADOR = db.ADMINISTRADOR.Find(id);
            db.ADMINISTRADOR.Remove(aDMINISTRADOR);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
