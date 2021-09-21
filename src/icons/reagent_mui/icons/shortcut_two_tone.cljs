(ns reagent-mui.icons.shortcut-two-tone
  "Imports @mui/icons-material/ShortcutTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shortcut-two-tone (create-svg-icon (e "path" #js {"d" "m21 11-6-6v5H8c-2.76 0-5 2.24-5 5v4h2v-4c0-1.65 1.35-3 3-3h7v5l6-6z"})
                                        "ShortcutTwoTone"))
