(ns reagent-mui.icons.apps-outage-rounded
  "Imports @mui/icons-material/AppsOutageRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def apps-outage-rounded (create-svg-icon (e "path" #js {"d" "M6 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm6 12c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm-6 0c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0-6c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm6 0c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm.07-10H12c-1.1 0-2 .9-2 2s.9 2 2 2c.22 0 .43-.04.63-.1C12.22 7.01 12 6.03 12 5c0-.34.02-.67.07-1zM19 12c-1.03 0-2.01-.22-2.9-.63-.06.2-.1.41-.1.63 0 1.1.9 2 2 2s2-.9 2-2v-.07c-.33.05-.66.07-1 .07zm-1 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm1-20c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm.5 7.5c0 .28-.22.5-.5.5-.27 0-.5-.22-.5-.5s.22-.5.5-.5.5.22.5.5zM19 6c-.28 0-.5-.22-.5-.5v-3c0-.28.22-.5.5-.5s.5.22.5.5v3c0 .28-.22.5-.5.5z"})
                                          "AppsOutageRounded"))
