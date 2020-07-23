(ns reagent-material-ui.icons.format-textdirection-l-to-r
  "Imports @material-ui/icons/FormatTextdirectionLToR as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-textdirection-l-to-r (create-svg-icon (e "path" #js {"d" "M9 10v5h2V4h2v11h2V4h2V2H9C6.79 2 5 3.79 5 6s1.79 4 4 4zm12 8l-4-4v3H5v2h12v3l4-4z"})
                                                  "FormatTextdirectionLToR"))
