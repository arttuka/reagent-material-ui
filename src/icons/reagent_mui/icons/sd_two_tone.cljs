(ns reagent-mui.icons.sd-two-tone
  "Imports @mui/icons-material/SdTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sd-two-tone (create-svg-icon [(e "path" #js {"d" "M4 18h16V6H4v12zm9-9h4c.55 0 1 .45 1 1v4c0 .55-.45 1-1 1h-4V9zm-7 4h1.5v.5h2v-1H7c-.55 0-1-.45-1-1V10c0-.55.45-1 1-1h3c.55 0 1 .45 1 1v1H9.5v-.5h-2v1H10c.55 0 1 .45 1 1V14c0 .55-.45 1-1 1H7c-.55 0-1-.45-1-1v-1z", "opacity" ".3"}) (e "path" #js {"d" "M14.5 10.5h2v3h-2z", "opacity" ".3"}) (e "path" #js {"d" "M7 15h3c.55 0 1-.45 1-1v-1.5c0-.55-.45-1-1-1H7.5v-1h2v.5H11v-1c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1v1.5c0 .55.45 1 1 1h2.5v1h-2V13H6v1c0 .55.45 1 1 1zm11-1v-4c0-.55-.45-1-1-1h-4v6h4c.55 0 1-.45 1-1zm-1.5-.5h-2v-3h2v3z"}) (e "path" #js {"d" "M20 4H4c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V6h16v12z"})]
                                  "SdTwoTone"))
