(ns reagent-material-ui.icons.luggage-sharp
  "Imports @material-ui/icons/LuggageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def luggage-sharp (create-svg-icon (e "path" #js {"d" "M19 6h-4V2H9v4H5v15h2c0 .55.45 1 1 1s1-.45 1-1h6c0 .55.45 1 1 1s1-.45 1-1h2V6zM9.5 18H8V9h1.5v9zm3.25 0h-1.5V9h1.5v9zm.75-12h-3V3.5h3V6zM16 18h-1.5V9H16v9z"})
                                    "LuggageSharp"))
