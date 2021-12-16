(ns reagent-mui.icons.apps-outage-sharp
  "Imports @mui/icons-material/AppsOutageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def apps-outage-sharp (create-svg-icon (e "path" #js {"d" "M4 8h4V4H4v4zm6 12h4v-4h-4v4zm-6 0h4v-4H4v4zm0-6h4v-4H4v4zm6 0h4v-4h-4v4zm6 6h4v-4h-4v4zm3-20c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm.5 8h-1V7h1v1zm0-2h-1V2h1v4zM16 14h4v-2.07c-.33.05-.66.07-1 .07-1.07 0-2.09-.24-3-.68V14zM10 4v4h2.68c-.44-.91-.68-1.93-.68-3 0-.34.02-.67.07-1H10z"})
                                        "AppsOutageSharp"))
