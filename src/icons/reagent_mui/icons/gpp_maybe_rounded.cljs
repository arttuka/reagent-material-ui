(ns reagent-mui.icons.gpp-maybe-rounded
  "Imports @mui/icons-material/GppMaybeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gpp-maybe-rounded (create-svg-icon (e "path" #js {"d" "m11.3 2.26-6 2.25C4.52 4.81 4 5.55 4 6.39v4.7c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91v-4.7c0-.83-.52-1.58-1.3-1.87l-6-2.25c-.45-.18-.95-.18-1.4-.01zM12 16c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-4c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v3c0 .55-.45 1-1 1z"})
                                        "GppMaybeRounded"))
