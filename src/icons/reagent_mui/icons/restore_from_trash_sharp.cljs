(ns reagent-mui.icons.restore-from-trash-sharp
  "Imports @mui/icons-material/RestoreFromTrashSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def restore-from-trash-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zm6-11 4 4h-2v4h-4v-4H8l4-4zm3.5-6-1-1h-5l-1 1H5v2h14V4z"})
                                               "RestoreFromTrashSharp"))
