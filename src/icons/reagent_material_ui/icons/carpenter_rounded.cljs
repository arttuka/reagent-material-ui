(ns reagent-material-ui.icons.carpenter-rounded
  "Imports @material-ui/icons/CarpenterRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def carpenter-rounded (create-svg-icon (e "path" #js {"d" "M19.73 14.23L7.71 2.21a.9959.9959 0 00-1.41 0L3.7 4.8c-.34.34-.39.88-.11 1.28l7.65 10.98c-.78.78-.78 2.05 0 2.83l1.41 1.41c.78.78 2.05.78 2.83 0l4.24-4.24c.79-.78.79-2.05.01-2.83zm-5.66 5.65l-1.41-1.41 4.24-4.24 1.41 1.41-4.24 4.24z"})
                                        "CarpenterRounded"))
