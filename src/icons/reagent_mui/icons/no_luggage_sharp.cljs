(ns reagent-mui.icons.no-luggage-sharp
  "Imports @mui/icons-material/NoLuggageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def no-luggage-sharp (create-svg-icon (e "path" #js {"d" "M12.75 9v.92l1.75 1.75V9H16v4.17l3 3V6h-4V2H9v4h-.17l3 3h.92zM10.5 3.5h3V6h-3V3.5zm10.69 17.69L2.81 2.81 1.39 4.22 5 7.83V21h2v1h2v-1h6v1h2v-1h1.17l1.61 1.61 1.41-1.42zM8 18v-7.17l1.5 1.5V18H8zm3.25 0v-3.92l1.5 1.5V18h-1.5z"})
                                       "NoLuggageSharp"))
