(ns reagent-mui.icons.merge-rounded
  "Imports @mui/icons-material/MergeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def merge-rounded (create-svg-icon (e "path" #js {"d" "M8.71 7.71a.9959.9959 0 0 1 0-1.41l2.59-2.59c.39-.39 1.02-.39 1.41 0L15.3 6.3c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0L13 6.83v5.1c0 1.06.42 2.08 1.17 2.83l4.12 4.12c.39.39.39 1.02 0 1.41s-1.02.39-1.41 0L12 15.41l-4.88 4.88c-.39.39-1.02.39-1.41 0a.9959.9959 0 0 1 0-1.41l4.12-4.12c.75-.75 1.17-1.77 1.17-2.83v-5.1l-.88.88c-.39.39-1.02.39-1.41 0z"})
                                    "MergeRounded"))
