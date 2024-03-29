(ns reagent-mui.icons.settings-accessibility-rounded
  "Imports @mui/icons-material/SettingsAccessibilityRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def settings-accessibility-rounded (create-svg-icon (e "path" #js {"d" "M20.74 4.96c-.13-.53-.67-.85-1.2-.73-2.38.54-5.05.77-7.54.77s-5.16-.23-7.54-.76c-.54-.12-1.07.19-1.2.73l-.02.05c-.13.54.19 1.1.73 1.22 1.62.37 3.37.62 5.03.76v11c0 .55.45 1 1 1s1-.45 1-1v-5h2v5c0 .55.45 1 1 1s1-.45 1-1V7c1.66-.14 3.41-.39 5.03-.76.54-.12.86-.68.73-1.22l-.02-.06zM12 4c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zM8 24c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1zm4 0c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1zm4 0c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1z"})
                                                     "SettingsAccessibilityRounded"))
