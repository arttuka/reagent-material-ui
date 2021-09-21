(ns reagent-mui.icons.code-off-rounded
  "Imports @mui/icons-material/CodeOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def code-off-rounded (create-svg-icon (e "path" #js {"d" "m19.17 12-3.88-3.88a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l4.59 4.59c.39.39.39 1.02 0 1.41l-2.88 2.88L17 14.17 19.17 12zM2.1 4.93l3.49 3.49-2.88 2.88c-.39.39-.39 1.02 0 1.41L7.3 17.3c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L4.83 12 7 9.83 19.07 21.9c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.4-.39 1.03 0 1.42z"})
                                       "CodeOffRounded"))
