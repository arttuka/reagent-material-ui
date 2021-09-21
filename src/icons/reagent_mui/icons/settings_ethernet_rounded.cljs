(ns reagent-mui.icons.settings-ethernet-rounded
  "Imports @mui/icons-material/SettingsEthernetRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def settings-ethernet-rounded (create-svg-icon (e "path" #js {"d" "M7.71 6.71a.9959.9959 0 0 0-1.41 0L1.71 11.3c-.39.39-.39 1.02 0 1.41L6.3 17.3c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.83 12l3.88-3.88c.38-.39.38-1.03 0-1.41zm8.58 0c-.39.39-.39 1.02 0 1.41L20.17 12l-3.88 3.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l4.59-4.59c.39-.39.39-1.02 0-1.41L17.7 6.7c-.38-.38-1.02-.38-1.41.01zM8 13c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1zm4 0c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1zm4-2c-.55 0-1 .45-1 1s.45 1 1 1 1-.45 1-1-.45-1-1-1z"})
                                                "SettingsEthernetRounded"))
