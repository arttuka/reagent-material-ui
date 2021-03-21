(ns reagent-material-ui.icons.no-drinks-sharp
  "Imports @material-ui/icons/NoDrinksSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-drinks-sharp (create-svg-icon (e "path" #js {"d" "M21.19 21.19L2.81 2.81 1.39 4.22l8.23 8.23L11 14v5H6v2h12v-.17l1.78 1.78 1.41-1.42zM13 19v-3.17L16.17 19H13zM7.83 5l-2-2H21v2l-6.2 6.97L9.83 7h6.74l1.78-2H7.83z"})
                                      "NoDrinksSharp"))
