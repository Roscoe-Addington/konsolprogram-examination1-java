# Behandlingar – Examination 1, Grundläggande Java-programmering

## Hur kör man programmet
Man kör programmet med Main.java och med gröna pilen. Det går också att trycka F5 + Shift på mitt tangetbordet.

Utskrift i Run-fönstret:
```
Behandlingar
P1 får KBT och har låg återfallsrisk, eftersom terapin lär ut strategier för att hantera besvären (behandlingstid: 8 veckor)
P2 får SSRI, som ger snabb effekt men har hög återfallsrisk när behandlingen avslutas (behandlingstid: 8 veckor)
Kan inte sätta behandlingstiden till 0 veckor.
P1 har fortfarande 8 veckors behandlingstid
Vecka 1: terapisession med P1
Vecka 2: terapisession med P1
Vecka 3: terapisession med P1
Antal behandlingar: 2
```

## Felsökning
Ett fel jag stötte på var i min första version av Lakemedelsbehandling.java i metoden ```aterfallsrisk()```. Ai upptäckte felt i min kod vid granskning.

```
@Override
public String aterfallsrisk() {
    return "får " + lakemedel + "(SSRI)" + " snabb effekt men hög återfallsrisk när behandlingen avslutas."; 

}
```
I Main skapades objektet med "SSRI" som läkemedel:

```new Lakemedelsbehandling("P2", 8, "SSRI");```

Fältet `lakemedel`innehöll alltså redan "SSRI", och sedan lades "(SSRI)" till direkt efter, utan mellanslag, därav resultat:

```P2 får SSRI(SSRI) snabb effekt men hög återfallsrisk när behandlingen avslutas.```

Jag tog bort "(SSRI)", så att bara fältet bestämmer läkemedelsnamnet. Jag lade också till "som ger" att meningen belv komplett.

## Hjälpmedel 
Jag använde mig av Ai och studieguiden. 
     Studieguiden hjälpte med strukturen och hade tydliga krav. AI var till stor hjälp med kodförslag och fungerade bra som bollplank.

Mina ändringar:
- skrev Lakemedelsbehandling själv
 - rättade texten i aterfallsrisk()
  - lade till kontroll av veckor i konstruktorn
   - satte MAX_VECKOR till 12
    - ändrade behandlingstiderna i Main och skrev om terapitexten 