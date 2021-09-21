(ns reagent-mui.icons.night-shelter-sharp
  "Imports @mui/icons-material/NightShelterSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def night-shelter-sharp (create-svg-icon (e "path" #js {"d" "M12 3 4 9v12h16V9l-8-6zm-2.25 9.5c.69 0 1.25.56 1.25 1.25S10.44 15 9.75 15s-1.25-.56-1.25-1.25.56-1.25 1.25-1.25zM17 18h-1v-1.5H8V18H7v-7h1v4.5h3.5V12H17v6z"})
                                          "NightShelterSharp"))
