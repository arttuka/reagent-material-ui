(ns reagent-material-ui.icons.restore-from-trash-sharp
  "Imports @material-ui/icons/RestoreFromTrashSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def restore-from-trash-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zm6-11l4 4h-2v4h-4v-4H8l4-4zm3.5-6l-1-1h-5l-1 1H5v2h14V4z"})
                                               "RestoreFromTrashSharp"))
