(ns reagent-mui.icons.manage-search-two-tone
  "Imports @mui/icons-material/ManageSearchTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def manage-search-two-tone (create-svg-icon (e "path" #js {"d" "M2 12h5v2H2zm16.17 1.75c.52-.79.83-1.73.83-2.75 0-2.76-2.24-5-5-5s-5 2.24-5 5 2.24 5 5 5c1.02 0 1.96-.31 2.76-.83L20.59 19 22 17.59l-3.83-3.84zM14 14c-1.65 0-3-1.35-3-3s1.35-3 3-3 3 1.35 3 3-1.35 3-3 3zM2 7h5v2H2zm0 10h10v2H2z"})
                                             "ManageSearchTwoTone"))
