(ns reagent-mui.icons.filter-b-and-w-rounded
  "Imports @mui/icons-material/FilterBAndWRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-b-and-w-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16-7-8v8H5l7-8V5h6c.55 0 1 .45 1 1v13z"})
                                             "FilterBAndWRounded"))
