(ns reagent-mui.icons.device-hub-rounded
  "Imports @mui/icons-material/DeviceHubRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def device-hub-rounded (create-svg-icon (e "path" #js {"d" "m17 16-4-4V8.82c1.35-.49 2.26-1.89 1.93-3.46-.25-1.18-1.23-2.12-2.42-2.32C10.63 2.73 9 4.17 9 6c0 1.3.84 2.4 2 2.82V12l-4 4H4c-.55 0-1 .45-1 1v3c0 .55.45 1 1 1h3c.55 0 1-.45 1-1v-2.05l4-4.2 4 4.2V20c0 .55.45 1 1 1h3c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1h-3z"})
                                         "DeviceHubRounded"))
