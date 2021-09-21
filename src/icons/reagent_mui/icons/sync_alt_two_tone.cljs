(ns reagent-mui.icons.sync-alt-two-tone
  "Imports @mui/icons-material/SyncAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sync-alt-two-tone (create-svg-icon (e "path" #js {"d" "m22 8-4-4v3H3v2h15v3l4-4zM2 16l4 4v-3h15v-2H6v-3l-4 4z"})
                                        "SyncAltTwoTone"))
