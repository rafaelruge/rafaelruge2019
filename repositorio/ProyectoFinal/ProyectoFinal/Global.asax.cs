using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.EntityFramework;
using ProyectoFinal.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Optimization;
using System.Web.Routing;

namespace ProyectoFinal
{
    public class MvcApplication : System.Web.HttpApplication
    {
        protected void Application_Start()
        {
            AreaRegistration.RegisterAllAreas();
            FilterConfig.RegisterGlobalFilters(GlobalFilters.Filters);
            RouteConfig.RegisterRoutes(RouteTable.Routes);
            BundleConfig.RegisterBundles(BundleTable.Bundles);

            ApplicationDbContext db = new ApplicationDbContext();
            //crear roles
            CrearRoles(db);
            CrearSuperUsuario(db);
            AsignarPermiso(db);
            db.Dispose();
        }

        private void CrearRoles(ApplicationDbContext db)
        {
            var rolemanager = new RoleManager<IdentityRole>(new RoleStore<IdentityRole>(db));
            if (!rolemanager.RoleExists("view"))
            {
                rolemanager.Create(new IdentityRole("view"));
            }
            if (!rolemanager.RoleExists("edit"))
            {
                rolemanager.Create(new IdentityRole("edit"));
            }
            if (!rolemanager.RoleExists("delete"))
            {
                rolemanager.Create(new IdentityRole("delete"));
            }

        }

        private void CrearSuperUsuario(ApplicationDbContext db)
        {
            var usermanager = new UserManager<ApplicationUser>(new UserStore<ApplicationUser>(db));
            var user = usermanager.FindByName("admin@gmail.com");
            if (user == null)
            {
                user = new ApplicationUser
                {
                    UserName = "admin@gmail.com",
                    Email = "admin@gmail.com"
                };
                usermanager.Create(user, "291015Rafaelruge#");
            }
        }

        private void AsignarPermiso(ApplicationDbContext db)
        {
            var userManager = new UserManager<ApplicationUser>(new UserStore<ApplicationUser>(db));
            var roleManager = new RoleManager<IdentityRole>(new RoleStore<IdentityRole>(db));

            var user = userManager.FindByName("admin@gmail.com");

            if (!userManager.IsInRole(user.Id, "view"))
            {
                userManager.AddToRole(user.Id, "view");
            }

            if (!userManager.IsInRole(user.Id, "edit"))
            {
                userManager.AddToRole(user.Id, "edit");
            }

            if (!userManager.IsInRole(user.Id, "delete"))
            {
                userManager.AddToRole(user.Id, "delete");
            }
        }

    }
}
