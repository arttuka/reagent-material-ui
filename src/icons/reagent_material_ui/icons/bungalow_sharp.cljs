(ns reagent-material-ui.icons.bungalow-sharp
  "Imports @material-ui/icons/BungalowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bungalow-sharp (create-svg-icon (e "path" #js {"d" "M12 3L4.2 15.5l1.7 1.06L7 14.8V21h4v-5h2v5h4v-6.21l1.1 1.77 1.7-1.06L12 3zm1 11h-2v-2h2v2z"})
                                     "BungalowSharp"))
