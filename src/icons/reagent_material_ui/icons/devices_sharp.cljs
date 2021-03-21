(ns reagent-material-ui.icons.devices-sharp
  "Imports @material-ui/icons/DevicesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def devices-sharp (create-svg-icon (e "path" #js {"d" "M4 6h18V4H2v13H0v3h14v-3H4V6zm20 2h-8v12h8V8zm-2 9h-4v-7h4v7z"})
                                    "DevicesSharp"))
