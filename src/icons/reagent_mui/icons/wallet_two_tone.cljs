(ns reagent-mui.icons.wallet-two-tone
  "Imports @mui/icons-material/WalletTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wallet-two-tone (create-svg-icon [(e "path" #js {"d" "M18 10H6c-.84 0-1.55.52-1.85 1.25l11.11 2.72c.31.08.64 0 .88-.2l3.49-2.92c-.37-.51-.96-.85-1.63-.85zm0-4H6c-1.1 0-2 .9-2 2v.55C4.59 8.21 5.27 8 6 8h12c.73 0 1.41.21 2 .55V8c0-1.1-.9-2-2-2z", "opacity" ".3"}) (e "path" #js {"d" "M18 4H6C3.79 4 2 5.79 2 8v8c0 2.21 1.79 4 4 4h12c2.21 0 4-1.79 4-4V8c0-2.21-1.79-4-4-4zm-1.86 9.77c-.24.2-.57.28-.88.2L4.15 11.25C4.45 10.52 5.16 10 6 10h12c.67 0 1.26.34 1.63.84l-3.49 2.93zM20 8.55c-.59-.34-1.27-.55-2-.55H6c-.73 0-1.41.21-2 .55V8c0-1.1.9-2 2-2h12c1.1 0 2 .9 2 2v.55z"})]
                                      "WalletTwoTone"))
