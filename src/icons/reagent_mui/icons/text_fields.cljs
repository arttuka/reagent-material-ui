(ns reagent-mui.icons.text-fields
  "Imports @mui/icons-material/TextFields as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-fields (create-svg-icon (e "path" #js {"d" "M2.5 4v3h5v12h3V7h5V4h-13zm19 5h-9v3h3v7h3v-7h3V9z"})
                                  "TextFields"))
