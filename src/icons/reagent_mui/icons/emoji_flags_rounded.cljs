(ns reagent-mui.icons.emoji-flags-rounded
  "Imports @mui/icons-material/EmojiFlagsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def emoji-flags-rounded (create-svg-icon (e "path" #js {"d" "M19 9h-5l-.72-1.45c-.17-.34-.52-.55-.9-.55H7V5.72c.6-.34 1-.98 1-1.72 0-1.1-.9-2-2-2s-2 .9-2 2c0 .74.4 1.38 1 1.72V20c0 .55.45 1 1 1s1-.45 1-1v-3h5l.72 1.45c.17.34.52.55.89.55H19c.55 0 1-.45 1-1v-8c0-.55-.45-1-1-1zm-1 8h-4l-1-2H7V9h5l1 2h5v6z"})
                                          "EmojiFlagsRounded"))
