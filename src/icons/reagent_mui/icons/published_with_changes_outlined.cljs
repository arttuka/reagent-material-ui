(ns reagent-mui.icons.published-with-changes-outlined
  "Imports @mui/icons-material/PublishedWithChangesOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def published-with-changes-outlined (create-svg-icon (e "path" #js {"d" "M18.6 19.5H21v2h-6v-6h2v2.73c1.83-1.47 3-3.71 3-6.23 0-4.07-3.06-7.44-7-7.93V2.05c5.05.5 9 4.76 9 9.95 0 2.99-1.32 5.67-3.4 7.5zM4 12c0-2.52 1.17-4.77 3-6.23V8.5h2v-6H3v2h2.4C3.32 6.33 2 9.01 2 12c0 5.19 3.95 9.45 9 9.95v-2.02c-3.94-.49-7-3.86-7-7.93zm12.24-3.89-5.66 5.66-2.83-2.83-1.41 1.41 4.24 4.24 7.07-7.07-1.41-1.41z"})
                                                      "PublishedWithChangesOutlined"))
