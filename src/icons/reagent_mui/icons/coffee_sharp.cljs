(ns reagent-mui.icons.coffee-sharp
  "Imports @mui/icons-material/CoffeeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def coffee-sharp (create-svg-icon (e "path" #js {"d" "M18.5 3H4v8c0 3.87 3.13 7 7 7s7-3.13 7-7v-1h.4c1.67 0 3.19-1.13 3.52-2.77C22.39 4.98 20.67 3 18.5 3zM16 5v3H6V5h10zm2.5 3H18V5h.5c.83 0 1.5.67 1.5 1.5S19.33 8 18.5 8zM4 19h16v2H4v-2z"})
                                   "CoffeeSharp"))
