(ns reagent-material-ui.icons.coffee-two-tone
  "Imports @material-ui/icons/CoffeeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def coffee-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 11c0 2.76 2.24 5 5 5s5-2.24 5-5v-1H6v1z", "opacity" ".3"}) (e "path" #js {"d" "M4 19h16v2H4zM18.5 3H6c-1.1 0-2 .9-2 2v5.71c0 3.83 2.95 7.18 6.78 7.29 3.96.12 7.22-3.06 7.22-7v-1h.5c1.93 0 3.5-1.57 3.5-3.5S20.43 3 18.5 3zM16 11c0 2.76-2.24 5-5 5s-5-2.24-5-5v-1h10v1zm0-3H6V5h10v3zm2.5 0H18V5h.5c.83 0 1.5.67 1.5 1.5S19.33 8 18.5 8z"}))
                                      "CoffeeTwoTone"))
