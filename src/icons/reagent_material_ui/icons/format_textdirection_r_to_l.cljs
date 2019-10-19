(ns reagent-material-ui.icons.format-textdirection-r-to-l
  "Imports @material-ui/icons/FormatTextdirectionRToL as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-textdirection-r-to-l (create-svg-icon (e "path" #js {"d" "M10 10v5h2V4h2v11h2V4h2V2h-8C7.79 2 6 3.79 6 6s1.79 4 4 4zm-2 7v-3l-4 4 4 4v-3h12v-2H8z"})
                                                  "FormatTextdirectionRToL"))
