using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Front.Models
{
    public class FrontCLIENTE
    {
        public int id { get; set; }
        [Required(ErrorMessage = "Este campo es necesario")]
        public string Nombre { get; set; }
        public string Apellidos { get; set; }
        public string Correo { get; set; }
    }
}