(ns reagent-material-ui.icons.piano-off-sharp
  "Imports @material-ui/icons/PianoOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def piano-off-sharp (create-svg-icon (e "path" #js {"d" "M21.19 21.19 2.81 2.81 1.39 4.22 3 5.83V21h15.17l1.61 1.61 1.41-1.42zM8.25 19H5V7.83l2 2v4.67h1.25V19zm1.5 0v-4.5H11v-.67l3.25 3.25V19h-4.5zM5.83 3H21v15.17l-2-2V5h-2v9.17l-4-4V5h-2v3.17L5.83 3z"})
                                      "PianoOffSharp"))
