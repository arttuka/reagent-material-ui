(ns reagent-mui.icons.copy-all-outlined
  "Imports @mui/icons-material/CopyAllOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def copy-all-outlined (create-svg-icon (e "path" #js {"d" "M18 2H9c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h9c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H9V4h9v12zM3 15v-2h2v2H3zm0-5.5h2v2H3v-2zM10 20h2v2h-2v-2zm-7-1.5v-2h2v2H3zM5 22c-1.1 0-2-.9-2-2h2v2zm3.5 0h-2v-2h2v2zm5 0v-2h2c0 1.1-.9 2-2 2zM5 6v2H3c0-1.1.9-2 2-2z"})
                                        "CopyAllOutlined"))
