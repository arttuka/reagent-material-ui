(ns reagent-mui.icons.gpp-maybe-outlined
  "Imports @mui/icons-material/GppMaybeOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gpp-maybe-outlined (create-svg-icon [(e "path" #js {"d" "M12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm6 9.09c0 4-2.55 7.7-6 8.83-3.45-1.13-6-4.82-6-8.83v-4.7l6-2.25 6 2.25v4.7z"}) (e "path" #js {"d" "M11 14h2v2h-2zm0-7h2v5h-2z"})]
                                         "GppMaybeOutlined"))
