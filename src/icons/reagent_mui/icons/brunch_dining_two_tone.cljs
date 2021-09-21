(ns reagent-mui.icons.brunch-dining-two-tone
  "Imports @mui/icons-material/BrunchDiningTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def brunch-dining-two-tone (create-svg-icon [(e "path" #js {"d" "M20 10h-2v1.47c0 .95.37 1.89 1.03 2.6.63-.71.97-1.61.97-2.56V10z", "opacity" ".3"}) (e "path" #js {"d" "M2 21.5c0 .28.22.5.49.5h13.02c.27 0 .49-.22.49-.5V20H2v1.5zm18.47-6.05c.99-1.07 1.53-2.48 1.53-3.94V2h-6v9.47c0 1.48.58 2.92 1.6 4l.4.42V22h4v-2h-2v-4.03l.47-.52zM18 4h2v4h-2V4zm1.03 10.07c-.65-.71-1.03-1.65-1.03-2.6V10h2v1.51c0 .95-.34 1.85-.97 2.56zM15.5 16H11v-2H7v2H2.5c-.28 0-.5.22-.5.5V18h14v-1.5c0-.28-.22-.5-.5-.5z"})]
                                             "BrunchDiningTwoTone"))
