(ns reagent-mui.icons.format-clear-rounded
  "Imports @mui/icons-material/FormatClearRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-clear-rounded (create-svg-icon (e "path" #js {"d" "M18.5 8c.83 0 1.5-.67 1.5-1.5S19.33 5 18.5 5H6.39l3 3h1.83l-.55 1.28 2.09 2.09L14.21 8h4.29zm-1.06 10.88L4.12 5.56a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l6.26 6.26-1.65 3.84c-.39.92.28 1.93 1.27 1.93.55 0 1.05-.33 1.27-.84l1.21-2.83 4.95 4.95c.39.39 1.02.39 1.41 0 .4-.38.4-1.01.01-1.4z"})
                                           "FormatClearRounded"))
