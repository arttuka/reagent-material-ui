(ns reagent-material-ui.icons.contact-mail-rounded
  "Imports @material-ui/icons/ContactMailRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def contact-mail-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 8V7l-2.5 1.75L15 7v1l2.5 1.75z"}) (e "path" #js {"d" "M22 3H2C.9 3 0 3.9 0 5v14c0 1.1.9 2 2 2h20c1.1 0 1.99-.9 1.99-2L24 5c0-1.1-.9-2-2-2zM9 8c1.65 0 3 1.35 3 3s-1.35 3-3 3-3-1.35-3-3 1.35-3 3-3zM2.08 19c1.38-2.39 3.96-4 6.92-4s5.54 1.61 6.92 4H2.08zM20 11h-5c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h5c.55 0 1 .45 1 1v3c0 .55-.45 1-1 1z"}))
                                           "ContactMailRounded"))
