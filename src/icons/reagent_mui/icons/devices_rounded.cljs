(ns reagent-mui.icons.devices-rounded
  "Imports @mui/icons-material/DevicesRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def devices-rounded (create-svg-icon (e "path" #js {"d" "M4 7c0-.55.45-1 1-1h16c.55 0 1-.45 1-1s-.45-1-1-1H4c-1.1 0-2 .9-2 2v11h-.5c-.83 0-1.5.67-1.5 1.5S.67 20 1.5 20H14v-3H4V7zm19 1h-6c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h6c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 9h-4v-7h4v7z"})
                                      "DevicesRounded"))
