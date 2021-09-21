(ns reagent-mui.icons.no-drinks-two-tone
  "Imports @mui/icons-material/NoDrinksTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def no-drinks-two-tone (create-svg-icon [(e "path" #js {"d" "M14.77 9h-2.94l1.55 1.56z", "opacity" ".3"}) (e "path" #js {"d" "M21.19 21.19 2.81 2.81 1.39 4.22l8.23 8.23L11 14v5H6v2h12v-.17l1.78 1.78 1.41-1.42zM13 19v-3.17L16.17 19H13zM7.83 5l-2-2H21v2l-6.2 6.97-1.42-1.42L14.77 9h-2.94l-2-2h6.74l1.78-2H7.83z"})]
                                         "NoDrinksTwoTone"))
