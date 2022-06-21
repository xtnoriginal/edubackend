package com.example.edubackend.controller;

import com.example.edubackend.filehandling.JSONHandling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.FileHandler;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/quiz")
public class QuizController {

    @GetMapping()
    public String quizQuestion(){

        JSONHandling jsonHandling = new JSONHandling();
       
        return "[{\n" +
                "  \"question\": \"A student wishes to find the volume of a small, irregularly-shaped stone.A ruler and a measuring cylinder containing some water are available.\\nWhich apparatus is needed?\",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"neither the ruler nor the measuring cylinder\"},\n" +
                "    {\"B\": \"the measuring cylinder only\"},\n" +
                "    {\"C\": \"the ruler and the measuring cylinder \"},\n" +
                "    {\"D\":  \"the ruler only\"}\n" +
                "\n" +
                "\n" +
                "  ]\n" +
                "\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"A ball is dropped from a table-top. Air resistance may be ignored. Which row describes the velocity and the acceleration of the ball at point X? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"neither the ruler nor the measuring cylinder\"},\n" +
                "      {\"B\": \"the measuring cylinder only\"},\n" +
                "      {\"C\": \"the ruler and the measuring cylinder \"},\n" +
                "      {\"D\":  \"the ruler only\"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows the speed-time graph for a car. Which area represents the distance travelled while the car is accelerating? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"X\"},\n" +
                "      {\"B\": \"X + Y\"},\n" +
                "      {\"C\": \"Y\"},\n" +
                "      {\"D\":  \"Y – X \"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"Which quantities are measured in the same unit? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"energy, power and work\"},\n" +
                "      {\"B\": \"energy and power, but not work \"},\n" +
                "      {\"C\": \"energy and work, but not power\"},\n" +
                "      {\"D\":  \"power and work, but not energy \"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "  \"question\": \"Five identical bags of rice are balanced on a uniform beam by an object of mass 10kg. \\n  Two more identical bags of rice are added to the other five. The average position of the bags on\\nthe beam does not change. What mass now balances the bags? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"3.5kg \"},\n" +
                "    {\"B\": \"7.0kg\"},\n" +
                "    {\"C\": \"12kg\"},\n" +
                "    {\"D\":  \"14kg\"}\n" +
                "  ]\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a cuboid block made from a metal of density 2.5g/ cm3\\n. What is the mass of the block? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"8.0g\"},\n" +
                "      {\"B\": \"16g\"},\n" +
                "      {\"C\": \"50g\"},\n" +
                "      {\"D\":  \"100g\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows an unbalanced rod. Two loads X and Y can be moved along the rod. The rod turns in a clockwise direction as shown.\\nWhich action could make the rod balance?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"moving X to the left \"},\n" +
                "      {\"B\": \"moving X to the right \"},\n" +
                "      {\"C\": \"moving Y to the right\"},\n" +
                "      {\"D\":  \"moving the pivot to the left\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \" A box is being lifted by a fork-lift truck. The weight of the box is 3000N.\\nThe force exerted by the fork-lift truck on the box is 3500N vertically upwards.\\nWhat is the resultant vertical force on the box? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"500N downwards\"},\n" +
                "      {\"B\": \"500N upwards\"},\n" +
                "      {\"C\": \"6500N downwards\"},\n" +
                "      {\"D\":  \"6500N upwards\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a ball hanging on a string. The ball swings from point W to point Z and back\\nto point W. Which statement about the ball is correct? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\" The kinetic energy of the ball is greatest at point W\"},\n" +
                "      {\"B\": \"The kinetic energy of the ball is greatest at point X. \"},\n" +
                "      {\"C\": \"The kinetic energy of the ball is greatest at point Y. \"},\n" +
                "      {\"D\":  \"The kinetic energy of the ball is the same at all points of the swing.\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A person in a factory has to lift a box on to a shelf. Which action involves the person doing the least amount of work? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"lifting the box quickly to the high shelf\"},\n" +
                "      {\"B\": \"lifting the box slowly to the high shelf \"},\n" +
                "      {\"C\": \"lifting the box to the low shelf first then lifting it to the high shelf \"},\n" +
                "      {\"D\":  \"lifting the box to the low shelf instead of to the high shelf\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which is a non-renewable energy resource? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"coal\"},\n" +
                "      {\"B\": \"solar\"},\n" +
                "      {\"C\": \"tides\"},\n" +
                "      {\"D\":  \"wind\"}\n" +
                "    ]\n" +
                "  }, {\n" +
                "  \"question\": \"The diagram shows a simple mercury barometer.\\nWhich labelled length is measured when finding atmospheric pressure? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"Identical toy bricks are placed one on top of another to make a tower on a table.Which graph shows the relationship between the pressure P that the tower exerts on the table\\nand the weight W of the tower? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"The table lists the melting points and the boiling points of four different substances.\\nWhich substance is a liquid at 0°C? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                "\n" +
                ", {\n" +
                "  \"question\": \"Air in a sealed syringe is slowly compressed by moving the piston. The temperature of the air\\nstays the same.Which statement about the air is correct? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"The pressure of the air decreases because its molecules now travel more slowly. \"},\n" +
                "    {\"B\": \"The pressure of the air decreases because the area of the syringe walls is now smaller. \"},\n" +
                "    {\"C\": \"The pressure of the air increases because its molecules now hit the syringe walls more frequently. \"},\n" +
                "    {\"D\": \"The pressure of the air increases because its molecules now travel more quickly. \"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"Which quantity gives the thermal capacity of a solid object? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"the energy lost by radiation from the object in 1.0s \"},\n" +
                "    {\"B\": \"the energy needed to melt the object \"},\n" +
                "    {\"C\": \"the energy needed to raise the temperature of the object by 1.0°C \"},\n" +
                "    {\"D\": \"the total amount of thermal energy in the object \"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"To mark a temperature scale on a thermometer, standard temperatures known as fixed points are\\nneeded.\\nWhich of these is a fixed point on the Celsius scale? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\" room temperature\"},\n" +
                "    {\"B\": \"the temperature inside a freezer\"},\n" +
                "    {\"C\": \"the temperature of pure melting ice \"},\n" +
                "    {\"D\": \"the temperature of pure warm water\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"The diagram shows electricity cables being put up on a warm day. The cables are left loose\\nbetween the poles, as shown in the diagram. Why are the cables left loose? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\": \"They will contract on cold days. \"},\n" +
                "    {\"B\": \"They will contract on very warm days. \"},\n" +
                "    {\"C\": \"They will expand on cold days.\"},\n" +
                "    {\"D\": \"They will expand on very warm days.\"}\n" +
                "  ]\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"A cotton sheet is ironed with a hot electric iron.\\nHow is energy transferred through the metal base of the iron to the sheet? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"by conduction only\"},\n" +
                "      {\"B\": \"by convection only\"},\n" +
                "      {\"C\": \"by radiation only\"},\n" +
                "      {\"D\": \"by convection and radiation only \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Two plastic cups are placed one inside the other. A small spacer keeps the two cups separated.\\n Hot water is poured into the inner cup and a lid is put on top, as shown. Which statement is correct?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \" A water wave in a shallow tank passes through a gap in a barrier. What happens to the speed and what happens to the wavelength of the wave as it passes\\nthrough the gap?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which is a unit of wavelength?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"hertz\"},\n" +
                "      {\"B\": \"metre\"},\n" +
                "      {\"C\": \"metre per second\"},\n" +
                "      {\"D\": \"second\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which diagram correctly shows a ray of light reflected by a plane mirror? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A ray of white light is incident on a glass prism. Which ray diagram shows the ray as it passes through the prism and emerges from the opposite\\nside?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A sound wave travels from a point X to another point Y. Which diagram represents the movement of the air molecules, due to the sound wave, in the\\nregion between X and Y? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Sound wave P has a greater amplitude and a larger wavelength in air than sound wave Q.\\nHow do the loudness and pitch of P compare with the loudness and pitch of Q?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"In which pair are both materials magnetic?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"aluminium and copper\"},\n" +
                "      {\"B\": \"copper and iron \"},\n" +
                "      {\"C\": \"iron and steel\"},\n" +
                "      {\"D\": \"steel and aluminium \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \" The diagram shows the magnetic field around two bar magnets. Which diagram shows the poles of the magnets?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a battery\"},\n" +
                "      {\"B\": \"a filament lamp\"},\n" +
                "      {\"C\": \"a resistor \"},\n" +
                "      {\"D\": \"a spring balance \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Which produces an electromotive force (e.m.f.)? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a battery\"},\n" +
                "      {\"B\": \"a filament lamp\"},\n" +
                "      {\"C\": \"a resistor \"},\n" +
                "      {\"D\": \"a spring balance \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The table describes four different resistance wires. They are all made from the same metal.\\nWhich wire has the smallest resistance? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Four lamps are each labelled 240V.\\nIn which circuit do all four lamps have normal brightness? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a 40Ω resistor and a 60Ω resistor connected in parallel. What is the total resistance between points P and Q?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a potential divider connected to two voltmeters P and Q. The resistance of the variable resistor is decreased.\\nWhich row shows what happens to the reading on each voltmeter? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a fire \"},\n" +
                "      {\"B\": \"a fuse blows \"},\n" +
                "      {\"C\": \"an electric shock\"},\n" +
                "      {\"D\": \"no current flows\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"After some building work in a house, a bare (uninsulated) live wire is left protruding from a wall.\\nWhat is the greatest hazard? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a fire \"},\n" +
                "      {\"B\": \"a fuse blows \"},\n" +
                "      {\"C\": \"an electric shock\"},\n" +
                "      {\"D\": \"no current flows\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A coil carries a current in a magnetic field. The coil experiences a turning effect.\\nWhich device uses this effect? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a d.c. motor \"},\n" +
                "      {\"B\": \"an electromagnet\"},\n" +
                "      {\"C\": \"a relay \"},\n" +
                "      {\"D\": \"a transformer\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A magnet is suspended from a spring so that it can move freely inside a stationary coil. The coil is\\nconnected to a sensitive centre-zero galvanometer. The magnet repeatedly moves slowly up and down.\\nWhat does the galvanometer show?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a constantly changing reading \"},\n" +
                "      {\"B\": \"a steady reading to the left \"},\n" +
                "      {\"C\": \"a steady reading to the right \"},\n" +
                "      {\"D\": \"a steady reading of zero \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"\\n  {\\n    \\\"question\\\": \\\"A nucleus of element X is represented as X 56\\\\n26 .\\\\nWhich is an isotope of element X? \\\",\\n    \\\"picture\\\": null,\\n    \\\"answers\\\" : [\\n      {\\\"A\\\": \\\"The bench is heated by convection from the bottom of the outer cup. \\\"},\\n      {\\\"B\\\": \\\"The lid reduces the energy lost by convection. \\\"},\\n      {\\\"C\\\": \\\"There is no thermal conduction through the sides of either cup. \\\"},\\n      {\\\"D\\\": \\\"Thermal radiation is prevented by the small air gap. \\\"}\\n    ]\\n  }\\n,\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"A nucleus of element X is represented as X 56\\n26 .\\nWhich is an isotope of element X? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The charge on a proton is e.\\nWhat is the charge on an electron and what is the charge on a neutron? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"A scientist carries out an experiment using a sealed source which emits β-particles. The range of\\nthe β-particles in the air is about 30cm.\\nWhich precaution is the most effective to protect the scientist from the radiation?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Which row describes the nature of α-particles and of γ-rays?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                "]";


        /*return " [\n" +
                "    {\n" +
                "        queno:\"que_1\",\n" +
                "        que : \"1) How many sides are equal in a scalene triangle?\",\n" +
                "        options : [{que_options: \"3\" , selected: false},{que_options:\"2\", selected: false},{que_options:\"0\", selected: false}],\n" +
                "        ans : \"0\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_2\",\n" +
                "        que : \"2) The angles of a triangle are 90°,35° and 55°.What type of triangle is this?\",\n" +
                "        options : [{que_options: \"Right Angled\" , selected: false},{que_options:\"Obtuse Angled\", selected: false},{que_options:\"Acute Angled\", selected: false}],\n" +
                "        ans : \"Right Angled\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_3\",\n" +
                "        que : \"3) The perimeter of an equilateral triangle is 24cm.Length of each side(in cm) is?\",\n" +
                "        options : [{que_options: \"9\" , selected: false},{que_options:\"6\", selected: false},{que_options:\"8\", selected: false}],\n" +
                "        ans : \"8\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_4\",\n" +
                "        que : \"4) The sum of angles of a triangle is?\",\n" +
                "        options : [{que_options: \"90\" , selected: false},{que_options:\"150\", selected: false},{que_options:\"180\", selected: false}],\n" +
                "        ans : \"180\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_5\",\n" +
                "        que : \"5) A triangle has angles 60°,60° and 60°.State the type of triangle?\",\n" +
                "        options : [{que_options: \"Isosceles\" , selected: false},{que_options:\"Equilateral\", selected: false},{que_options:\"Scalene\", selected: false}],\n" +
                "        ans : \"Equilateral\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_6\",\n" +
                "        que : \"6) What is a third angle for a triangle where angle1 = 57° and angle2 = 92° ?\",\n" +
                "        options : [{que_options: \"45\" , selected: false},{que_options:\"60\", selected: false},{que_options:\"31\", selected: false}],\n" +
                "        ans : \"31\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_7\",\n" +
                "        que : \"7) Pythagoras theorem is applicable to which type of triangles?\",\n" +
                "        options : [{que_options: \"Right\" , selected: false},{que_options:\"Acute\", selected: false},{que_options:\"Obtuse\", selected: false}],\n" +
                "        ans : \"Right\"\n" +
                "    },\n" +
                "    {\n" +
                "        queno:\"que_8\",\n" +
                "        que : \"8) The triangle which has 2 sides congruent?\",\n" +
                "        options : [{que_options: \"Equilateral\" , selected: false},{que_options:\"Isosceles\", selected: false},{que_options:\"Scalene\", selected: false}],\n" +
                "        ans : \"Isosceles\"\n" +
                "    }\n" +
                "]";*/
    }

    @GetMapping("/sub")
    public String getQuiz(){

        JSONHandling jsonHandling = new JSONHandling();
        String questionPaper = jsonHandling.readJSONfile();

        System.out.println(questionPaper);

        return questionPaper;

        /*return "[{\n" +
                "  \"question\": \"A student wishes to find the volume of a small, irregularly-shaped stone.A ruler and a measuring cylinder containing some water are available.\\nWhich apparatus is needed?\",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"neither the ruler nor the measuring cylinder\"},\n" +
                "    {\"B\": \"the measuring cylinder only\"},\n" +
                "    {\"C\": \"the ruler and the measuring cylinder \"},\n" +
                "    {\"D\":  \"the ruler only\"}\n" +
                "\n" +
                "\n" +
                "  ]\n" +
                "\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"A ball is dropped from a table-top. Air resistance may be ignored. Which row describes the velocity and the acceleration of the ball at point X? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"neither the ruler nor the measuring cylinder\"},\n" +
                "      {\"B\": \"the measuring cylinder only\"},\n" +
                "      {\"C\": \"the ruler and the measuring cylinder \"},\n" +
                "      {\"D\":  \"the ruler only\"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows the speed-time graph for a car. Which area represents the distance travelled while the car is accelerating? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"X\"},\n" +
                "      {\"B\": \"X + Y\"},\n" +
                "      {\"C\": \"Y\"},\n" +
                "      {\"D\":  \"Y – X \"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"Which quantities are measured in the same unit? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"energy, power and work\"},\n" +
                "      {\"B\": \"energy and power, but not work \"},\n" +
                "      {\"C\": \"energy and work, but not power\"},\n" +
                "      {\"D\":  \"power and work, but not energy \"}\n" +
                "    ]\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "  \"question\": \"Five identical bags of rice are balanced on a uniform beam by an object of mass 10kg. \\n  Two more identical bags of rice are added to the other five. The average position of the bags on\\nthe beam does not change. What mass now balances the bags? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"3.5kg \"},\n" +
                "    {\"B\": \"7.0kg\"},\n" +
                "    {\"C\": \"12kg\"},\n" +
                "    {\"D\":  \"14kg\"}\n" +
                "  ]\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a cuboid block made from a metal of density 2.5g/ cm3\\n. What is the mass of the block? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"8.0g\"},\n" +
                "      {\"B\": \"16g\"},\n" +
                "      {\"C\": \"50g\"},\n" +
                "      {\"D\":  \"100g\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows an unbalanced rod. Two loads X and Y can be moved along the rod. The rod turns in a clockwise direction as shown.\\nWhich action could make the rod balance?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"moving X to the left \"},\n" +
                "      {\"B\": \"moving X to the right \"},\n" +
                "      {\"C\": \"moving Y to the right\"},\n" +
                "      {\"D\":  \"moving the pivot to the left\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \" A box is being lifted by a fork-lift truck. The weight of the box is 3000N.\\nThe force exerted by the fork-lift truck on the box is 3500N vertically upwards.\\nWhat is the resultant vertical force on the box? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"500N downwards\"},\n" +
                "      {\"B\": \"500N upwards\"},\n" +
                "      {\"C\": \"6500N downwards\"},\n" +
                "      {\"D\":  \"6500N upwards\"}\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a ball hanging on a string. The ball swings from point W to point Z and back\\nto point W. Which statement about the ball is correct? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\" The kinetic energy of the ball is greatest at point W\"},\n" +
                "      {\"B\": \"The kinetic energy of the ball is greatest at point X. \"},\n" +
                "      {\"C\": \"The kinetic energy of the ball is greatest at point Y. \"},\n" +
                "      {\"D\":  \"The kinetic energy of the ball is the same at all points of the swing.\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A person in a factory has to lift a box on to a shelf. Which action involves the person doing the least amount of work? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"lifting the box quickly to the high shelf\"},\n" +
                "      {\"B\": \"lifting the box slowly to the high shelf \"},\n" +
                "      {\"C\": \"lifting the box to the low shelf first then lifting it to the high shelf \"},\n" +
                "      {\"D\":  \"lifting the box to the low shelf instead of to the high shelf\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which is a non-renewable energy resource? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\":\"coal\"},\n" +
                "      {\"B\": \"solar\"},\n" +
                "      {\"C\": \"tides\"},\n" +
                "      {\"D\":  \"wind\"}\n" +
                "    ]\n" +
                "  }, {\n" +
                "  \"question\": \"The diagram shows a simple mercury barometer.\\nWhich labelled length is measured when finding atmospheric pressure? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"Identical toy bricks are placed one on top of another to make a tower on a table.Which graph shows the relationship between the pressure P that the tower exerts on the table\\nand the weight W of the tower? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"The table lists the melting points and the boiling points of four different substances.\\nWhich substance is a liquid at 0°C? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"coal\"},\n" +
                "    {\"B\": \"solar\"},\n" +
                "    {\"C\": \"tides\"},\n" +
                "    {\"D\":  \"wind\"}\n" +
                "  ]\n" +
                "}\n" +
                "\n" +
                ", {\n" +
                "  \"question\": \"Air in a sealed syringe is slowly compressed by moving the piston. The temperature of the air\\nstays the same.Which statement about the air is correct? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"The pressure of the air decreases because its molecules now travel more slowly. \"},\n" +
                "    {\"B\": \"The pressure of the air decreases because the area of the syringe walls is now smaller. \"},\n" +
                "    {\"C\": \"The pressure of the air increases because its molecules now hit the syringe walls more frequently. \"},\n" +
                "    {\"D\": \"The pressure of the air increases because its molecules now travel more quickly. \"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"Which quantity gives the thermal capacity of a solid object? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\"the energy lost by radiation from the object in 1.0s \"},\n" +
                "    {\"B\": \"the energy needed to melt the object \"},\n" +
                "    {\"C\": \"the energy needed to raise the temperature of the object by 1.0°C \"},\n" +
                "    {\"D\": \"the total amount of thermal energy in the object \"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"To mark a temperature scale on a thermometer, standard temperatures known as fixed points are\\nneeded.\\nWhich of these is a fixed point on the Celsius scale? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\":\" room temperature\"},\n" +
                "    {\"B\": \"the temperature inside a freezer\"},\n" +
                "    {\"C\": \"the temperature of pure melting ice \"},\n" +
                "    {\"D\": \"the temperature of pure warm water\"}\n" +
                "  ]\n" +
                "}\n" +
                ", {\n" +
                "  \"question\": \"The diagram shows electricity cables being put up on a warm day. The cables are left loose\\nbetween the poles, as shown in the diagram. Why are the cables left loose? \",\n" +
                "  \"picture\": null,\n" +
                "  \"answers\" : [\n" +
                "    {\"A\": \"They will contract on cold days. \"},\n" +
                "    {\"B\": \"They will contract on very warm days. \"},\n" +
                "    {\"C\": \"They will expand on cold days.\"},\n" +
                "    {\"D\": \"They will expand on very warm days.\"}\n" +
                "  ]\n" +
                "},\n" +
                "  {\n" +
                "    \"question\": \"A cotton sheet is ironed with a hot electric iron.\\nHow is energy transferred through the metal base of the iron to the sheet? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"by conduction only\"},\n" +
                "      {\"B\": \"by convection only\"},\n" +
                "      {\"C\": \"by radiation only\"},\n" +
                "      {\"D\": \"by convection and radiation only \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Two plastic cups are placed one inside the other. A small spacer keeps the two cups separated.\\n Hot water is poured into the inner cup and a lid is put on top, as shown. Which statement is correct?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \" A water wave in a shallow tank passes through a gap in a barrier. What happens to the speed and what happens to the wavelength of the wave as it passes\\nthrough the gap?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which is a unit of wavelength?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"hertz\"},\n" +
                "      {\"B\": \"metre\"},\n" +
                "      {\"C\": \"metre per second\"},\n" +
                "      {\"D\": \"second\"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Which diagram correctly shows a ray of light reflected by a plane mirror? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  },\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A ray of white light is incident on a glass prism. Which ray diagram shows the ray as it passes through the prism and emerges from the opposite\\nside?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A sound wave travels from a point X to another point Y. Which diagram represents the movement of the air molecules, due to the sound wave, in the\\nregion between X and Y? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"Sound wave P has a greater amplitude and a larger wavelength in air than sound wave Q.\\nHow do the loudness and pitch of P compare with the loudness and pitch of Q?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"P is louder and higher in pitch than Q.\"},\n" +
                "      {\"B\": \"P is louder and lower in pitch than Q. \"},\n" +
                "      {\"C\": \"P is quieter and higher in pitch than Q. \"},\n" +
                "      {\"D\": \"P is quieter and lower in pitch than Q. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"In which pair are both materials magnetic?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"aluminium and copper\"},\n" +
                "      {\"B\": \"copper and iron \"},\n" +
                "      {\"C\": \"iron and steel\"},\n" +
                "      {\"D\": \"steel and aluminium \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \" The diagram shows the magnetic field around two bar magnets. Which diagram shows the poles of the magnets?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a battery\"},\n" +
                "      {\"B\": \"a filament lamp\"},\n" +
                "      {\"C\": \"a resistor \"},\n" +
                "      {\"D\": \"a spring balance \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Which produces an electromotive force (e.m.f.)? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a battery\"},\n" +
                "      {\"B\": \"a filament lamp\"},\n" +
                "      {\"C\": \"a resistor \"},\n" +
                "      {\"D\": \"a spring balance \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The table describes four different resistance wires. They are all made from the same metal.\\nWhich wire has the smallest resistance? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Four lamps are each labelled 240V.\\nIn which circuit do all four lamps have normal brightness? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a 40Ω resistor and a 60Ω resistor connected in parallel. What is the total resistance between points P and Q?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"less than 40Ω\"},\n" +
                "      {\"B\": \"50Ω\"},\n" +
                "      {\"C\": \"between 60Ω and 100Ω\"},\n" +
                "      {\"D\": \"100Ω\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The diagram shows a potential divider connected to two voltmeters P and Q. The resistance of the variable resistor is decreased.\\nWhich row shows what happens to the reading on each voltmeter? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a fire \"},\n" +
                "      {\"B\": \"a fuse blows \"},\n" +
                "      {\"C\": \"an electric shock\"},\n" +
                "      {\"D\": \"no current flows\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"After some building work in a house, a bare (uninsulated) live wire is left protruding from a wall.\\nWhat is the greatest hazard? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a fire \"},\n" +
                "      {\"B\": \"a fuse blows \"},\n" +
                "      {\"C\": \"an electric shock\"},\n" +
                "      {\"D\": \"no current flows\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A coil carries a current in a magnetic field. The coil experiences a turning effect.\\nWhich device uses this effect? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a d.c. motor \"},\n" +
                "      {\"B\": \"an electromagnet\"},\n" +
                "      {\"C\": \"a relay \"},\n" +
                "      {\"D\": \"a transformer\"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "\n" +
                "\n" +
                "  {\n" +
                "    \"question\": \"A magnet is suspended from a spring so that it can move freely inside a stationary coil. The coil is\\nconnected to a sensitive centre-zero galvanometer. The magnet repeatedly moves slowly up and down.\\nWhat does the galvanometer show?  \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"a constantly changing reading \"},\n" +
                "      {\"B\": \"a steady reading to the left \"},\n" +
                "      {\"C\": \"a steady reading to the right \"},\n" +
                "      {\"D\": \"a steady reading of zero \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"\\n  {\\n    \\\"question\\\": \\\"A nucleus of element X is represented as X 56\\\\n26 .\\\\nWhich is an isotope of element X? \\\",\\n    \\\"picture\\\": null,\\n    \\\"answers\\\" : [\\n      {\\\"A\\\": \\\"The bench is heated by convection from the bottom of the outer cup. \\\"},\\n      {\\\"B\\\": \\\"The lid reduces the energy lost by convection. \\\"},\\n      {\\\"C\\\": \\\"There is no thermal conduction through the sides of either cup. \\\"},\\n      {\\\"D\\\": \\\"Thermal radiation is prevented by the small air gap. \\\"}\\n    ]\\n  }\\n,\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"A nucleus of element X is represented as X 56\\n26 .\\nWhich is an isotope of element X? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"The charge on a proton is e.\\nWhat is the charge on an electron and what is the charge on a neutron? \",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"A scientist carries out an experiment using a sealed source which emits β-particles. The range of\\nthe β-particles in the air is about 30cm.\\nWhich precaution is the most effective to protect the scientist from the radiation?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                ",\n" +
                "  {\n" +
                "    \"question\": \"Which row describes the nature of α-particles and of γ-rays?\",\n" +
                "    \"picture\": null,\n" +
                "    \"answers\" : [\n" +
                "      {\"A\": \"The bench is heated by convection from the bottom of the outer cup. \"},\n" +
                "      {\"B\": \"The lid reduces the energy lost by convection. \"},\n" +
                "      {\"C\": \"There is no thermal conduction through the sides of either cup. \"},\n" +
                "      {\"D\": \"Thermal radiation is prevented by the small air gap. \"}\n" +
                "    ]\n" +
                "  }\n" +
                "]" ;*/
    }
}
