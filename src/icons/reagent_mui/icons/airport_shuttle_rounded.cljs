(ns reagent-mui.icons.airport-shuttle-rounded
  "Imports @mui/icons-material/AirportShuttleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airport-shuttle-rounded (create-svg-icon (e "path" #js {"d" "m22.41 10.41-4.83-4.83c-.37-.37-.88-.58-1.41-.58H3c-1.1 0-2 .89-2 2v7c0 1.1.9 2 2 2 0 1.66 1.34 3 3 3s3-1.34 3-3h6c0 1.66 1.34 3 3 3s3-1.34 3-3c1.1 0 2-.9 2-2v-2.17c0-.53-.21-1.04-.59-1.42zM3 10V8c0-.55.45-1 1-1h3v4H4c-.55 0-1-.45-1-1zm3 7.25c-.69 0-1.25-.56-1.25-1.25s.56-1.25 1.25-1.25 1.25.56 1.25 1.25-.56 1.25-1.25 1.25zM13 11H9V7h4v4zm5 6.25c-.69 0-1.25-.56-1.25-1.25s.56-1.25 1.25-1.25 1.25.56 1.25 1.25-.56 1.25-1.25 1.25zM15 11V7h1l4 4h-5z"})
                                              "AirportShuttleRounded"))
