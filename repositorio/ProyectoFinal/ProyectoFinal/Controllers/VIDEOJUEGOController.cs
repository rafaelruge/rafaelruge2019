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
    public class VIDEOJUEGOController : Controller
    {
        private contextosProyec db = new contextosProyec();

        // GET: VIDEOJUEGO
        public ActionResult Index()
        {
            return View(db.VIDEOJUEGO.ToList());
        }

        // GET: VIDEOJUEGO/Details/5
        public ActionResult Details(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VIDEOJUEGO vIDEOJUEGO = db.VIDEOJUEGO.Find(id);
            if (vIDEOJUEGO == null)
            {
                return HttpNotFound();
            }
            return View(vIDEOJUEGO);
        }

        // GET: VIDEOJUEGO/Create
        [Authorize(Users = "admin@gmail.com")]
        public ActionResult Create()
        {
            return View();
        }

        // POST: VIDEOJUEGO/Create
        [Authorize(Users = "admin@gmail.com")]
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "ID_VIDEOJUEGO,NOMBRE_VIDEOJUEGO,CATEGORIA_VIDOJUEGO,PESO_VIDEOJUEGO,CATEGORIA_EDAD")] VIDEOJUEGO vIDEOJUEGO)
        {
            if (ModelState.IsValid)
            {
                db.VIDEOJUEGO.Add(vIDEOJUEGO);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(vIDEOJUEGO);
        }

        // GET: VIDEOJUEGO/Edit/5
        [Authorize(Users = "admin@gmail.com")]
        public ActionResult Edit(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VIDEOJUEGO vIDEOJUEGO = db.VIDEOJUEGO.Find(id);
            if (vIDEOJUEGO == null)
            {
                return HttpNotFound();
            }
            return View(vIDEOJUEGO);
        }

        // POST: VIDEOJUEGO/Edit/5
        [Authorize(Users = "admin@gmail.com")]
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "ID_VIDEOJUEGO,NOMBRE_VIDEOJUEGO,CATEGORIA_VIDOJUEGO,PESO_VIDEOJUEGO,CATEGORIA_EDAD")] VIDEOJUEGO vIDEOJUEGO)
        {
            if (ModelState.IsValid)
            {
                db.Entry(vIDEOJUEGO).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(vIDEOJUEGO);
        }

        // GET: VIDEOJUEGO/Delete/5
        [Authorize(Users = "admin@gmail.com")]
        public ActionResult Delete(decimal id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VIDEOJUEGO vIDEOJUEGO = db.VIDEOJUEGO.Find(id);
            if (vIDEOJUEGO == null)
            {
                return HttpNotFound();
            }
            return View(vIDEOJUEGO);
        }

        // POST: VIDEOJUEGO/Delete/5
        [Authorize(Users = "admin@gmail.com")]
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(decimal id)
        {
            VIDEOJUEGO vIDEOJUEGO = db.VIDEOJUEGO.Find(id);
            db.VIDEOJUEGO.Remove(vIDEOJUEGO);
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
