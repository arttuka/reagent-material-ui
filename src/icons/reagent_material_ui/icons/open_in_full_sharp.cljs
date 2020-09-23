(ns reagent-material-ui.icons.open-in-full-sharp
  "Imports @material-ui/icons/OpenInFullSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def open-in-full-sharp (create-svg-icon (e "path" #js {"d" "M21 11V3h-8l3.29 3.29-10 10L3 13v8h8l-3.29-3.29 10-10z"})
                                         "OpenInFullSharp"))
