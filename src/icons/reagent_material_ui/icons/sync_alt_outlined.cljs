(ns reagent-material-ui.icons.sync-alt-outlined
  "Imports @material-ui/icons/SyncAltOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sync-alt-outlined (create-svg-icon (e "path" #js {"d" "M22 8l-4-4v3H3v2h15v3l4-4zM2 16l4 4v-3h15v-2H6v-3l-4 4z"})
                                        "SyncAltOutlined"))
