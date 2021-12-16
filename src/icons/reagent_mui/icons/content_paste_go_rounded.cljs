(ns reagent-mui.icons.content-paste-go-rounded
  "Imports @mui/icons-material/ContentPasteGoRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def content-paste-go-rounded (create-svg-icon [(e "path" #js {"d" "M5 5h2v1c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2V5h2v6h2V5c0-1.1-.9-2-2-2h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h5v-2H5V5zm7-2c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"}) (e "path" #js {"d" "m21.29 16.29-2.58-2.58a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.87.88H13c-.55 0-1 .45-1 1s.45 1 1 1h5.17l-.87.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l2.58-2.58c.39-.4.39-1.03 0-1.42z"})]
                                               "ContentPasteGoRounded"))
