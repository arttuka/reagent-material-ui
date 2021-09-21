(ns reagent-mui.icons.first-page-rounded
  "Imports @mui/icons-material/FirstPageRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def first-page-rounded (create-svg-icon (e "path" #js {"d" "M17.7 15.89 13.82 12l3.89-3.89c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-4.59 4.59c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0 .38-.38.38-1.02-.01-1.4zM7 6c.55 0 1 .45 1 1v10c0 .55-.45 1-1 1s-1-.45-1-1V7c0-.55.45-1 1-1z"})
                                         "FirstPageRounded"))
