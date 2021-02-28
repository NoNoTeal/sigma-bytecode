public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ub113\u927d\u7c6b\ubefe\u71ae {
    public void \ub113\u927d\u7c6b\ubefe\u71ae() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ub113\u927d\u7c6b\ubefe\u71ae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int \u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd(float p0) {
        var_3_6C : float
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_6C = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, div:float(p0:float, ldc:float(3.0f)), ldc:float(-1.0f), ldc:float(1.0f))
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7330\u9033\u7d52\u71ae\u4f52\u760c, sub:float(ldc:float(0.62222224f), mul:float(var_3_6C:float, ldc:float(0.05f))), add:float(ldc:float(0.5f), mul:float(var_3_6C:float, ldc:float(0.1f))), ldc:float(1.0f)))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u7043\ufcaf\u3bd6\u16f6\u7330\u34df(float p0, float p1, float p2, boolean p3) {
        var_4_61 : int
        var_6_6A : \ua6bd\u4975\uc7fe\u3711\u8350
        var_4_11B : int
        var_7_12A : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_186_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_186_1 : \u527a\u5f50\u92ff\ud36e\u3e75\u51fa [generated]
        stack_186_2 : \ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_61 = and:int(ldc:int(-692246792), ldc:int(-76601524))
        var_6_6A = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350)
        invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u647c\ubb2b\ub83f\u67d0\u0c95>(\u9255\u0c95\u4cd9\ube23\u760c::\u8640\ub19c\u4f52\ubff1\u3e2a\u8389), ldc:int(8), xor:int(ldc:int(20486), ldc:int(20482)), and:int(ldc:int(22340), ldc:int(52))))
        invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5140\u7e3f\u67d0\u7873\u12cb>(\u9255\u0c95\u4cd9\ube23\u760c::\u2dcc\uc2bd\u34df\u8258\u5d20\u071d), xor:int(ldc:int(13443), ldc:int(13447)), xor:int(ldc:int(-24567), ldc:int(-24565)), and:int(ldc:int(2055), ldc:int(10187))))
        invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u416d\u4179\u5db4\u4179\u839e>(\u9255\u0c95\u4cd9\ube23\u760c::\ubff1\uafe7\ua068\uc29a\ud217\u494c), ldc:int(8), and:int(ldc:int(7338), ldc:int(8706)), and:int(ldc:int(388), ldc:int(29190))))
        
        if (p3:boolean) {
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350)
            goto(Label_0270)
        }
        
        Label_0227:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-135398069))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u927d\ufe34\u64f2\ucef1\u8258\u183a, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7873\u1833\uceb8\uae87\u760c\uc238, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(100), ldc:int(25), ldc:int(100))
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2)), ldc:int(0))) {
            var_4_11B = and:int(var_4_61:int, ldc:int(-8441788))
            var_7_12A = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\ucfaf\u47c2\u4492\uae5d\ub18d\u4c2b))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u385b\ud4fe\u960f\u8389\u960f, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u385b\u51fa\ube23\ub18d\u92ee\u494c, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            stack_186_0 = var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187
            stack_186_1 = getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8)
            
            if (logicalnot:boolean(p3:boolean)) {
                var_4_11B = and:int(var_4_11B:int, ldc:int(-67131657))
                stack_186_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8c8a\u67d0\u3a62\ud158\u8350\u965f)
            }
            else {
                stack_186_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u67e9\u5db4\uf94d\u6b0d\u6bb9\uceb8)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, stack_186_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_186_1:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa, stack_186_2:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3711\u12b2\ub7dc\u9af2\u99f7\u7d52, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub113\u6198\u69d9\ubcb0\u385b\u64ab, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d)), p0:float), p1:float), p2:float), ldc:float(0.8f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, p2:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_6_6A:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_7_12A:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0227)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u9937\u34df\uf9c5\ub1b9\u67e9\u7873(float p0, float p1, boolean p2) {
        var_3_61 : int
        var_5_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_6_82 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(-614225238), ldc:int(-96605987))
            var_5_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_6_82 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u4cd9\u9033\u494c\u56bd\ubefe\u4c04, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1678905345))
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ufe34\u4d85\u71ae\u873d\u5f50\u5654, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            else {
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u61a4\u7ce1\u156b\u5bc4\u4c04\uc4d2, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ud7e8\uc31c\u4f52\u3776\u99f7\uc84e, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ud4fe\u5db4\u8bb0\u5654\u74b1\u64f2)), p0:float), p1:float), ldc:float(0.6f)), ldc:float(0.6f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.6f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u9033\u51b2\ubded\ub6ab\u4975\ua068() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\uc229\u3d64\ubcb0\u8d98\uc9f6\uc4d2, ldc:float(0.1f), ldc:float(0.2f), ldc:int(40), and:int(ldc:int(22), ldc:int(8898)), and:int(ldc:int(20603), ldc:int(515))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u4daf\ufe34\u99f7\ubff1\uc7fe\uc238() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6198\ubcb0\u3711\u6435\u4e72\u718f, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1, ldc:float(0.1f), ldc:float(0.2f), ldc:float(0.8f), and:int[expected:boolean](ldc:int(23065), ldc:int(-23230)), and:int[expected:boolean](ldc:int(4115), ldc:int(8261)), and:int[expected:boolean](ldc:int(-17885), ldc:int(16844)), var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u3711\u0b8e\ub32d\u40a9\ud51e\u4f52() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6198\ubcb0\u3711\u6435\u4e72\u718f, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1, ldc:float(0.2f), ldc:float(0.4f), ldc:float(0.8f), and:int[expected:boolean](ldc:int(-21322), ldc:int(17217)), xor:int[expected:boolean](ldc:int(20500), ldc:int(20501)), xor:int[expected:boolean](ldc:int(8976), ldc:int(8977)), var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u4daf\u3c25\u8aa5\u4179\uc87f\u6d99() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6198\ubcb0\u3711\u6435\u4e72\u718f, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5db4\uc2bd\u8389\u0800\u718f>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6ec6\u8df4\u3d4b\u8df4\ubff1), ldc:int(10), xor:int(ldc:int(2049), ldc:int(2048)), xor:int(ldc:int(-32736), ldc:int(-32735)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u88c5\u3776\u3e2a\u120d>(\u9255\u0c95\u4cd9\ube23\u760c::\u983f\u5d20\u8d90\u7e3f\ub8be\uc9f6), and:int(ldc:int(67), ldc:int(4270)), and:int(ldc:int(657), ldc:int(1069)), and:int(ldc:int(20825), ldc:int(2081))))
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1, ldc:float(0.2f), ldc:float(0.4f), ldc:float(0.9f), and:int[expected:boolean](ldc:int(10693), ldc:int(-10696)), and:int[expected:boolean](ldc:int(18200), ldc:int(-26398)), and:int[expected:boolean](ldc:int(10313), ldc:int(4743)), var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u67e9\u8389\u12b2\uc238\u6c56\u4f4a() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\uc229\u3d64\ubcb0\u8d98\uc9f6\uc4d2, ldc:float(0.45f), ldc:float(0.3f), ldc:int(10), and:int(ldc:int(12867), ldc:int(17681)), and:int(ldc:int(20487), ldc:int(11801))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u7bad\uc7fe\u99f7\u9033\u718f\u8d98() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u624e\u6c56\u6c56\u9937\u600f\u12cb, ldc:float(0.1f), ldc:float(0.2f), ldc:int(40), and:int(ldc:int(8595), ldc:int(78))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u7d52\u4e72\u8d98\uae5d\u8d98\u7ce1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u624e\u6c56\u6c56\u9937\u600f\u12cb, ldc:float(0.45f), ldc:float(0.3f), ldc:int(10), and:int(ldc:int(4737), ldc:int(2101))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc229\u3d64\ubcb0\u8d98\uc9f6\uc4d2(float p0, float p1, int p2, int p3, int p4) {
        var_7_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_7_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6198\ubcb0\u3711\u6435\u4e72\u718f, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5db4\uc2bd\u8389\u0800\u718f>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6ec6\u8df4\u3d4b\u8df4\ubff1), p2:int, xor:int(ldc:int(4632), ldc:int(4633)), p3:int)), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u88c5\u3776\u3e2a\u120d>(\u9255\u0c95\u4cd9\ube23\u760c::\u983f\u5d20\u8d90\u7e3f\ub8be\uc9f6), xor:int(ldc:int(1089), ldc:int(1091)), and:int(ldc:int(21), ldc:int(6465)), p4:int)), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u4bc8\u5fe1\u59ec\u624e\ucfaf>(\u9255\u0c95\u4cd9\ube23\u760c::\u494c\uf995\u6cfe\u8308\u3d4b\u7330), xor:int(ldc:int(-26560), ldc:int(-26559)), and:int(ldc:int(10305), ldc:int(801)), xor:int(ldc:int(8204), ldc:int(8206))))
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u8308\u3d64\u59ec\ub171\ud217\u760c, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1, p0:float, p1:float, ldc:float(0.9f), and:int[expected:boolean](ldc:int(-23895), ldc:int(23830)), and:int[expected:boolean](ldc:int(-22355), ldc:int(5970)), and:int[expected:boolean](ldc:int(-2295), ldc:int(2290)), var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u624e\u6c56\u6c56\u9937\u600f\u12cb(float p0, float p1, int p2, int p3) {
        var_6_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6198\ubcb0\u3711\u6435\u4e72\u718f, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5db4\uc2bd\u8389\u0800\u718f>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6ec6\u8df4\u3d4b\u8df4\ubff1), p2:int, and:int(ldc:int(3), ldc:int(601)), p3:int)), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u4bc8\u5fe1\u59ec\u624e\ucfaf>(\u9255\u0c95\u4cd9\ube23\u760c::\u494c\uf995\u6cfe\u8308\u3d4b\u7330), ldc:int(80), xor:int(ldc:int(-27632), ldc:int(-27631)), and:int(ldc:int(662), ldc:int(10)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u88c5\u3776\u3e2a\u120d>(\u9255\u0c95\u4cd9\ube23\u760c::\u983f\u5d20\u8d90\u7e3f\ub8be\uc9f6), xor:int(ldc:int(-32600), ldc:int(-32598)), and:int(ldc:int(16897), ldc:int(9231)), and:int(ldc:int(4769), ldc:int(3333))))
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1, p0:float, p1:float, ldc:float(0.9f), xor:int[expected:boolean](ldc:int(-32743), ldc:int(-32744)), and:int[expected:boolean](ldc:int(-24288), ldc:int(7324)), and:int[expected:boolean](ldc:int(-15613), ldc:int(13508)), var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ucfaf\u7049\u8c8a\u718f\u8bb0\u5fe1(float p0, float p1, float p2, boolean p3, boolean p4, boolean p5, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 p6) {
        var_7_174 : int
        var_9_72 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_7_174 = and:int(ldc:int(1083437230), ldc:int(1608772541))
            var_9_72 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            
            if (logicalnot:boolean(p4:boolean)) {
                if (logicalnot:boolean(p5:boolean)) {
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\uc87f\u64f2\u5bc4\ud171\ua3b4\u4cd9))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_7_174 = and:int(var_7_174:int, ldc:int(840161579))
                    goto(Label_0339)
                }
                
                if (cmpne:boolean(and:int(var_7_174:int, ldc:int(1)), ldc:int(0))) {
                    var_7_174 = and:int(var_7_174:int, ldc:int(1646058952))
                    goto(Label_0288)
                }
                
                if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(268435456)), ldc:int(0))) {
                    var_7_174 = and:int(var_7_174:int, ldc:int(2075355742))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u3bc9\u72f1\u8413\u64f2\ub18d\ud523))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p3:boolean) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub83f\u16f6\u7ce1\u7bad\u120d\u67e9, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        looporswitchbreak()
                    }
                }
                
                Label_0226:
                
                if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(65536)), ldc:int(0))) {
                    var_7_174 = and:int(var_7_174:int, ldc:int(338873818))
                    goto(Label_0339)
                }
                
                if (cmpne:boolean(and:int(var_7_174:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(65536)), ldc:int(0))) {
                        var_7_174 = and:int(var_7_174:int, ldc:int(-2043673157))
                        loopcontinue()
                    }
                    
                    var_7_174 = and:int(var_7_174:int, ldc:int(1800403310))
                    
                    if (logicalnot:boolean(p4:boolean)) {
                        if (logicalnot:boolean(p5:boolean)) {
                            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u416d\ua61f\u4bc8\u4cd9\ua61f\u51fa, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        }
                    }
                }
                
                Label_0288:
                
                if (cmpne:boolean(and:int(var_7_174:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_7_174 = and:int(var_7_174:int, ldc:int(346069439))
                        loopcontinue()
                    }
                    
                    var_7_174 = and:int(var_7_174:int, ldc:int(-817629554))
                    
                    if (p4:boolean) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6c56\uc2bd\u71ae\u927d\u5654\u0a06, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        looporswitchbreak()
                    }
                }
                
                Label_0339:
                
                if (cmpne:boolean(and:int(var_7_174:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0288)
                }
                
                if (cmpne:boolean(and:int(var_7_174:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0226)
                }
                
                if (cmpeq:boolean(and:int(var_7_174:int, ldc:int(512)), ldc:int(0))) {
                    var_7_174 = and:int(var_7_174:int, ldc:int(-802428724))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc229\u7873\u6ec6\ubded\u0c95\u9a18, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u3d4b\u0b8e\uc2bd\u9937\u927d, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u960f\u4c04\u4daf\u92ee\u51fa\u4cd9, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u71f1\u4ab3\u74b1\u92ee\u4179\ua3b4, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u4492\ud12e\u0b8e\u8753\u0b8e\ube23)), p0:float), p1:float), ldc:float(0.95f)), p2:float), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.95f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, p6:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_9_72:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u12b2\u3c25\ub7dc\u51b2\u71f1\u74b1(float p0, float p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf> p2, boolean p3) {
        var_4_63 : int
        var_6_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        var_7_A6 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = and:int(ldc:int(1016154096), ldc:int(-1095149876))
            var_6_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub18d\u1833\u6b0d\u0a06\u9033>(\u9255\u0c95\u4cd9\ube23\u760c::\u624e\u5db4\ub70c\uae5d\u6ec6\u6cfe), and:int(ldc:int(2309), ldc:int(12855)), xor:int(ldc:int(-31729), ldc:int(-31733)), ldc:int(6)))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_7_A6 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), p2:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (logicalnot:boolean(p3:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-37757198))
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7043\u6ec6\ud523\u64ab\ub102\u392e, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            else {
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ua562\u3d64\ud4fe\u47c2\u6435\ud4fe, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ud217\u647c\ub7dc\u5fe1\u7bad\ud217, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc9f6\u36d3\ubded\u392e\u71f1\u67d0, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u7e3f\u718f\u7af6\u9033\ud158\u446c)), p0:float), p1:float), ldc:float(0.2f)), ldc:float(0.3f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.2f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_6_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_7_A6:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u3711\u74b1\uc238\u1187\u527a\u4daf(float p0, float p1, boolean p2, boolean p3, boolean p4) {
        var_5_63 : int
        var_7_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        var_8_80 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_63 = and:int(ldc:int(-708788178), ldc:int(-939887167))
            var_7_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u4bc8\u3d4b\u600f\uc3e3\uae5d\u392e, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_8_80 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u59ec\uc910\ubcb0\u3776\u965f\u6ec6))
            
            if (p2:boolean) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u61a4\u7af6\u7043\uf995\u51b2\u92ff))
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1404974656))
                }
                else {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1304460759))
                    
                    if (p3:boolean) {
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0b8e\ubff1\u6d99\u3e75\u52d3\u9937))
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (p4:boolean) {
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u92ff\u7049\u624e\u92ff\ucb79, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u4cd9\ua562\u12b2\u6b5f\u5db4\u156b))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\u7ce1\u9a18\uae87\ucef1\u9a18, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u59ec\ud36e\u9a18\u92ee\ubefe\u7006, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6c56\u3a62\u6fb0\u8640\u7049\uff55, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u12b2\u4ab3\ubff1\u40a9\u836c\u647c, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ucfaf\u6cfe\uc910\u392e\uc910\ubf56)), p0:float), p1:float), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_8_80:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u6d99\u9a18\u9255\uafe7\uf995\u5fe1(boolean p0) {
        var_1_61 : int
        var_3_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_1_17F : int
        var_4_85 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(549029977), ldc:int(1052585599))
            var_3_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u946b\u4d85\ua3b4\u0800\ub7dc\uae87, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            
            if (logicalnot:boolean(p0:boolean)) {
                invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u8308\u3d64\u59ec\ub171\ud217\u760c, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            }
            
            var_1_17F = and:int(var_1_61:int, ldc:int(-1310290954))
            var_4_85 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            
            if (logicalnot:boolean(p0:boolean)) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7006\u527a\u3711\u9937\u8d90\u64f2)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0336)
                }
                
                if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(1062934891))
                    goto(Label_0288)
                }
                
                if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(32)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(-492671490))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ubefe\ub8be\ua562\u527a\u446c\u8cae, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p0:boolean) {
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ua562\uae87\u5f50\u3a62\u3e75\u52d3))
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(1664181511))
                    goto(Label_0336)
                }
                
                if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(128)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(1447667283))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_17F = and:int(var_1_17F:int, ldc:int(552545400))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc910\u3a62\u8753\u4c04\u16f6\u120d, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p0:boolean) {
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u839e\u4c2b\u927d\ua6bd\ub32d\u0c95))
                    }
                }
                
                Label_0288:
                
                if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_17F = and:int(var_1_17F:int, ldc:int(-236604299))
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_17F = and:int(var_1_17F:int, ldc:int(1706475001))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p0:boolean) {
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u9a18\u4f52\u6435\u156b\u8c8a\ua068))
                        looporswitchbreak()
                    }
                }
                
                Label_0336:
                
                if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0288)
                }
                
                if (cmpeq:boolean(and:int(var_1_17F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(1878207506))
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_1_17F:int, ldc:int(16)), ldc:int(0))) {
                    var_1_17F = and:int(var_1_17F:int, ldc:int(699702012))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    looporswitchbreak()
                }
                
                var_1_17F = and:int(var_1_17F:int, ldc:int(1116907936))
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ucef1\u98a4\uae87\u99f7\uc31c\u4975)), ldc:float(0.125f)), ldc:float(0.05f)), ldc:float(0.8f)), ldc:float(0.4f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.8f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_4_85:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u97b7\u071d\ubcb0\u8389\u3bd6\u392e(\u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 p0) {
        var_3_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ube23\u946b\u4e72\u74b1\uc4d2\uc229, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u3c25\u385b\ucb79\u7043\u3dd3\ucfaf)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(0.5f)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(10518688)), and:int(ldc:int(-5868), ldc:int(1706))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, p0:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u946b\uc4d2\u527a\u8413\u1187\u8389() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u97b7\u071d\ubcb0\u8389\u3bd6\u392e, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u647c\ub1b9\u16f6\u4c04\uc29a\u2dcc))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u6b0d\ud51e\uc229\ubf56\uc31c\ub19c() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u97b7\u071d\ubcb0\u8389\u3bd6\u392e, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u647c\ub1b9\u16f6\u4c04\uc29a\u2dcc)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u5bc4\u5245\u5fe1\u99f7\uc2bd\u7d52))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub83f\u7c6b\u3711\uc3e3\u97e6\u16f6() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u97b7\u071d\ubcb0\u8389\u3bd6\u392e, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u647c\ub1b9\u16f6\u4c04\uc29a\u2dcc)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8413\ubcb0\u0800\u4daf\u0c95\ud12e))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u6b5f\u9a18\u927d\u183a\ufcaf\uf94d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u97b7\u071d\ubcb0\u8389\u3bd6\u392e, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u647c\ub1b9\u16f6\u4c04\uc29a\u2dcc)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8413\ubcb0\u0800\u4daf\u0c95\ud12e)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u9af2\ub113\u4cd9\u759a\u36d3\ub32d)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ufe34\ubb2b\uc29a\ud7e8\u3e75\u6d69))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub8be\u7e3f\u4e72\u3e2a\uc4d2\u873d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u97b7\u071d\ubcb0\u8389\u3bd6\u392e, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u647c\ub1b9\u16f6\u4c04\uc29a\u2dcc)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u5140\u3dd3\uf94d\u76bc\u927d\u0b8e), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uff55\ucb79\u8d90\uc84e\ud523\u6b0d))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u6198\u6c56\u88c5\u839e\u7ce1\u5db4(float p0, float p1) {
        var_4_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_5_7D : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u12cb\uc910\uff55\u5bc4\u8d90\u93a2, var_4_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_5_7D = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\uae5d\uc31c\u3bc9\u97b7\u56bd\u5f50))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u64ab\ud12e\u7006\u7bad\u8308\u8640, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u6c52\u4c04\ucfaf\u8258\uf995\u759a)), p0:float), p1:float), ldc:float(0.9f)), ldc:float(1.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.9f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_4_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_5_7D:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u64ab\uae87\u8cae\u97b7\u0c95\ub102(float p0, float p1, float p2, boolean p3, boolean p4, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 p5) {
        var_6_63 : int
        expr_65 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_8E_1 : \u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf> [generated]
        var_6_17A : int
        var_8_91 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_6_AF : int
        stack_FB_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_FB_1 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_63 = and:int(ldc:int(1461656986), ldc:int(1968090027))
            expr_65 = initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>)
            
            if (logicalnot:boolean(p4:boolean)) {
                var_6_63 = and:int(var_6_63:int, ldc:int(-718734434))
                stack_8E_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d)
            }
            else {
                stack_8E_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u97e6\u4f52\u9a18\uc238\ufcaf\ubefe)
            }
            
            var_6_17A = and:int(var_6_63:int, ldc:int(1571532255))
            var_8_91 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, expr_65:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_8E_1:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            
            if (logicalnot:boolean(p3:boolean)) {
                if (logicalnot:boolean(p4:boolean)) {
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u71f1\u59ec\uc29a\u74b1\uc29a\u6435)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_6_17A:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0343)
                }
                
                if (cmpne:boolean(and:int(var_6_17A:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_AF = and:int(var_6_17A:int, ldc:int(1602202511))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    stack_FB_0 = var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187
                    
                    if (logicalnot:boolean(p3:boolean)) {
                        var_6_AF = and:int(var_6_AF:int, ldc:int(2008829325))
                        stack_FB_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4)
                    }
                    else {
                        stack_FB_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06)
                    }
                    
                    var_6_17A = and:int(var_6_AF:int, ldc:int(-708093553))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, stack_FB_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_FB_1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (logicalnot:boolean(p4:boolean)) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u647c\uc2e8\u1187\uc3e3\u51b2\uf94d, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    }
                }
                
                Label_0275:
                
                if (cmpeq:boolean(and:int(var_6_17A:int, ldc:int(8)), ldc:int(0))) {
                    var_6_17A = and:int(var_6_17A:int, ldc:int(293647992))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_17A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_6_17A = and:int(var_6_17A:int, ldc:int(1779514451))
                        loopcontinue()
                    }
                    
                    var_6_17A = and:int(var_6_17A:int, ldc:int(-719832146))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p4:boolean) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u1833\u965f\u4492\u7873\ud51e\u8df4, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u946b\u8df4\ufe34\u760c\u4492\u8709, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        looporswitchbreak()
                    }
                }
                
                Label_0343:
                
                if (cmpeq:boolean(and:int(var_6_17A:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0275)
                }
                
                if (cmpne:boolean(and:int(var_6_17A:int, ldc:int(524288)), ldc:int(0))) {
                    var_6_17A = and:int(var_6_17A:int, ldc:int(-682890872))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6ec6\u67e9\u67d0\u34df\u4c04\u8640, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u3d4b\u0b8e\uc2bd\u9937\u927d, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3e75\u7af6\u12b2\u120d\u5d20\uc31c, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    looporswitchbreak()
                }
                
                var_6_17A = and:int(var_6_17A:int, ldc:int(-1553691859))
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u6435\u62da\u071d\ud36e\u64ab\uc910)), p0:float), p1:float), p2:float), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, p2:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, p5:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_8_91:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u7006\uc87f\u8d90\ud51e\u600f\u446c(float p0, float p1, float p2, boolean p3, boolean p4) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u64ab\uae87\u8cae\u97b7\u0c95\ub102, p0:float, p1:float, p2:float, p3:boolean, p4:boolean, invokestatic:\ua6bd\u4975\uc7fe\u3711\u8350(\ub113\u927d\u7c6b\ubefe\u71ae::\u3e2a\u8df4\u92ee\u3c25\u8df4\ud36e)))
        }
        
        goto(Label_0006)
    }
    
    private static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u3e2a\u8df4\u92ee\u3c25\u8df4\ud36e() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ubefe\ubff1\u12b2\u760c\u071d>(\u9255\u0c95\u4cd9\ube23\u760c::\u7330\u446c\u98a4\u0c95\u3d4b\u4cd9), and:int(ldc:int(2561), ldc:int(1281)), and:int(ldc:int(8226), ldc:int(2314)), ldc:int(6))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u4179\u4ab3\u6d69\u99f7\u8cae>(\u9255\u0c95\u4cd9\ube23\u760c::\uf94d\u965f\uc246\u494c\u74b1\ud36e), and:int(ldc:int(17555), ldc:int(2593)), xor:int(ldc:int(16674), ldc:int(16675)), and:int(ldc:int(8457), ldc:int(2081))))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\ua6bd\u4975\uc7fe\u3711\u8350(var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u74b1\u516c\u40a9\u183a\u72f1\ub113() {
        var_2_65 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_65 = invokestatic:\ua6bd\u4975\uc7fe\u3711\u8350(\ub113\u927d\u7c6b\ubefe\u71ae::\u3e2a\u8df4\u92ee\u3c25\u8df4\ud36e)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_2_65:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub18d\u1833\u6b0d\u0a06\u9033>(\u9255\u0c95\u4cd9\ube23\u760c::\u624e\u5db4\ub70c\uae5d\u6ec6\u6cfe), ldc:int(8), xor:int(ldc:int(4371), ldc:int(4375)), xor:int(ldc:int(-32760), ldc:int(-32756))))
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u64ab\uae87\u8cae\u97b7\u0c95\ub102, ldc:float(1.5f), ldc:float(0.025f), ldc:float(1.0f), and:int[expected:boolean](ldc:int(17361), ldc:int(3073)), and:int[expected:boolean](ldc:int(25323), ldc:int(-25580)), var_2_65:\ua6bd\u4975\uc7fe\u3711\u8350))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u69d9\u71ae\u92ee\u7c6b\u960f\uf94d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf> p0, float p1, float p2, boolean p3, boolean p4) {
        var_5_63 : int
        var_7_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        var_8_7E : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_A8_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_A8_1 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_63 = and:int(ldc:int(-1052072263), ldc:int(-1822787685))
            var_7_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_8_7E = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), p0:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u760c\uc238\ud523\u3e75\u839e\u0c95, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            stack_A8_0 = var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187
            
            if (logicalnot:boolean(p3:boolean)) {
                var_5_63 = and:int(var_5_63:int, ldc:int(-906304872))
                stack_A8_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4)
            }
            else {
                stack_A8_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, stack_A8_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_A8_1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ua3b4\u9af2\uc9f6\uf94d\u40a9\u6d69, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (p4:boolean) {
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3dd3\u6435\u8413\u6c56\uc910\u6cfe, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u946b\ud171\u624e\u6bb9\ub7dc\uc910, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u61a4\u7e3f\uff55\u946b\uc29a\u88c5, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u76bc\uf94d\ub102\ubcb0\u8aa5\uc2e8)), p1:float), p2:float), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc84e\u8753\u92ff\ucfaf\ufe34\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4f4a\u5bc4\u12cb\ub8be\ufcaf\ubf56, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), ldc:int(10387789)), ldc:int(9470285)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_7_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_8_7E:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc246\ua61f\u97b7\u3504\uc229\uc2e8(float p0, float p1, boolean p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u69d9\u71ae\u92ee\u7c6b\u960f\uf94d, getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u61a4\u8308\u183a\u3e2a\ua562\u946b), p0:float, p1:float, p2:boolean, and:int[expected:boolean](ldc:int(14242), ldc:int(-14307))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub19c\u4e72\u7c6b\u6198\u6ec6\u5654(float p0, float p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u69d9\u71ae\u92ee\u7c6b\u960f\uf94d, getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5db4\uc910\u7006\ucb79\u51fa\u34df), p0:float, p1:float, and:int[expected:boolean](ldc:int(2049), ldc:int(20673)), and:int[expected:boolean](ldc:int(2565), ldc:int(139))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc3e3\u1187\uafe7\ub102\u71ae\ua3b4() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u69d9\u71ae\u92ee\u7c6b\u960f\uf94d, getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u47c2\u4c2b\ud4fe\ubcb0\u3e2a\u5fe1), ldc:float(0.1f), ldc:float(0.2f), xor:int[expected:boolean](ldc:int(5633), ldc:int(5632)), and:int[expected:boolean](ldc:int(-4151), ldc:int(4150))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ud12e\ub70c\u494c\u8640\u67d0\uc84e(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 p0, int p1, int p2, boolean p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 p4) {
        var_5_63 : int
        stack_98_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_98_1 : float [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_63 = and:int(ldc:int(1665337267), ldc:int(133400499))
            stack_98_0 = invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5))
            
            if (logicalnot:boolean(p3:boolean)) {
                var_5_63 = and:int(var_5_63:int, ldc:int(-1008506893))
                stack_98_1 = ldc:float(-1.0f)
            }
            else {
                stack_98_1 = ldc:float(-1.8f)
            }
            
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, stack_98_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_98_1:float), ldc:float(0.1f)), ldc:float(0.5f)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), p1:int), p2:int), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.5f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, p0:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, p4:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u836c\u6b0d\uc3e3\u71f1\u4daf> p0, boolean p1, boolean p2, boolean p3) {
        var_4_63 : int
        var_6_70 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_93_0 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>> [generated]
        var_4_91 : int
        var_7_93 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>
        var_4_A8 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = and:int(ldc:int(-1521026223), ldc:int(-1207998469))
            var_6_70 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), p0:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-268770305))
                stack_93_0 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7d52\u624e\u61a4\u92ff\u385b\uc229)
            }
            else {
                stack_93_0 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7330\u76bc\u5db4\u93a2\u5bc4\ud158)
            }
            
            var_4_91 = and:int(var_4_63:int, ldc:int(-1486918154))
            var_7_93 = stack_93_0:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>
            
            if (logicalnot:boolean(p3:boolean)) {
                loop {
                    if (cmpeq:boolean(and:int(var_4_91:int, ldc:int(536870912)), ldc:int(0))) {
                        var_4_A8 = and:int(var_4_91:int, ldc:int(857218483))
                    }
                    else {
                        var_4_A8 = and:int(var_4_91:int, ldc:int(-1084569270))
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187, var_7_93:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>)
                        
                        if (p1:boolean) {
                            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u3d4b\u7ce1\u7e3f\u527a\u3bd6\u527a))
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(64)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_4_91 = and:int(var_4_A8:int, ldc:int(1039408754))
                }
                
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub8be\u839e\u4ab3\u8389\ud217\uf9c5, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            else {
                if (p1:boolean) {
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u3d4b\u7ce1\u7e3f\u527a\u3bd6\u527a))
                }
                
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub8be\u839e\u4ab3\u8389\ud217\uf9c5, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187, var_7_93:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u156b\u6bb9\u3a62\ub32d\ubefe\u3bd6))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u71f1\u624e\ua068\u99f7\uc7fe\u51b2, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc910\u12b2\u527a\uc4d2\u446c\u99f7, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\u67d0\u9a18\u6ec6\u8aa5\u1187(var_6_70:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc2e8\u0b8e\ud158\uae87\u5f50\u6435(boolean p0) {
        var_1_61 : int
        var_3_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        stack_C5_0 : int [generated]
        var_1_C4 : int
        var_5_D7 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_FB_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_FB_1 : \u527a\u5f50\u92ff\ud36e\u3e75\u51fa [generated]
        stack_FB_2 : \ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(445062085), ldc:int(-1614841185))
            var_3_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u839e\ud171\u3d64\u3504\u6d69\u0b8e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, xor:int(ldc:int(8201), ldc:int(8202)), xor:int(ldc:int(-30685), ldc:int(-30681)), ldc:int(15))
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uc29a\u946b\ucef1\u4e72\u64f2>(\u9255\u0c95\u4cd9\ube23\u760c::\u8bb0\u7873\ucef1\u4f4a\u4daf\u516c), ldc:int(15), xor:int(ldc:int(-15871), ldc:int(-15872)), and:int(ldc:int(12293), ldc:int(711))))
            
            if (p0:boolean) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-590147589))
                stack_C5_0 = and:int(ldc:int(-8460), ldc:int(8459))
            }
            else {
                stack_C5_0 = and:int(ldc:int(16897), ldc:int(5547))
            }
            
            var_1_C4 = and:int(var_1_61:int, ldc:int(1975196638))
            var_5_D7 = stack_FB_0 = invokestatic(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, getstatic(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d), p0, and(ldc(-32026), ldc(30744)), stack_C5_0)
            stack_FB_1 = getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8)
            
            if (logicalnot:boolean(p0:boolean)) {
                var_1_C4 = and:int(var_1_C4:int, ldc:int(-1870420049))
                stack_FB_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u2dcc\u76bc\u8258\uceb8\uc4d2\u3711)
            }
            else {
                stack_FB_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ubcb0\uc4d2\u4bc8\u71ae\uae87\ub83f)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, stack_FB_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_FB_1:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa, stack_FB_2:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc229\u88c5\u6d69\u7873\u0800\u6198, var_5_D7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7af6\u34df\uc3e3\uc229\u97b7\u4daf, var_5_D7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_5_D7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(4020182), ldc:int(329011), p0:boolean, var_5_D7:\u67d0\u9a18\u6ec6\u8aa5\u1187))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u5f50\uc238\u3e75\ubefe\u6ec6\u873d(boolean p0) {
        var_1_61 : int
        var_3_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_4_BA : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_DE_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_DE_1 : \u527a\u5f50\u92ff\ud36e\u3e75\u51fa [generated]
        stack_DE_2 : \ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(2070825914), ldc:int(-1355855494))
            var_3_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u839e\ud171\u3d64\u3504\u6d69\u0b8e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, and:int(ldc:int(25345), ldc:int(4277)), xor:int(ldc:int(8961), ldc:int(8965)), ldc:int(10))
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u839e\u3d4b\u527a\uc2bd\u5d20\u97b7), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub83f\u72f1\u51b2\u494c\u0c95>(\u9255\u0c95\u4cd9\ube23\u760c::\u7ce1\u9937\u839e\u9af2\ub6ab\u8cae), and:int(ldc:int(595), ldc:int(3337)), and:int(ldc:int(4133), ldc:int(25745)), and:int(ldc:int(8210), ldc:int(1958))))
            var_4_BA = stack_DE_0 = invokestatic(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, getstatic(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d), p0, and(ldc(-17799), ldc(17670)), and(ldc(2315), ldc(5121)))
            stack_DE_1 = getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8)
            
            if (logicalnot:boolean(p0:boolean)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-77629569))
                stack_DE_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u12cb\u5245\u61a4\u4179\u52d3\u5f50)
            }
            else {
                stack_DE_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u946b\u9a18\u71ae\ub19c\u4bc8\ucef1)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, stack_DE_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_DE_1:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa, stack_DE_2:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc229\u88c5\u6d69\u7873\u0800\u6198, var_4_BA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7af6\u34df\uc3e3\uc229\u97b7\u4daf, var_4_BA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_4_BA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(4159204), ldc:int(329011), p0:boolean, var_4_BA:\u67d0\u9a18\u6ec6\u8aa5\u1187))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u88c5\ub18d\u4e72\uf94d\uc246\uc229(boolean p0) {
        var_1_7B : int
        var_3_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_1_B7 : int
        var_4_12F : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_153_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_153_1 : \u527a\u5f50\u92ff\ud36e\u3e75\u51fa [generated]
        stack_153_2 : \ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_7B = and:int(ldc:int(-62453872), ldc:int(-91273231))
        var_3_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
        
        if (p0:boolean) {
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u839e\ud171\u3d64\u3504\u6d69\u0b8e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(8), and:int(ldc:int(26820), ldc:int(4)), ldc:int(8))
            goto(Label_0161)
        }
        
        Label_0110:
        
        if (cmpeq:boolean(and:int(var_1_7B:int, ldc:int(2097152)), ldc:int(0))) {
            var_1_7B = and:int(var_1_7B:int, ldc:int(-1695588464))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u839e\ud171\u3d64\u3504\u6d69\u0b8e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(10), xor:int(ldc:int(5125), ldc:int(5127)), ldc:int(15))
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_1_7B:int, ldc:int(8)), ldc:int(0))) {
            var_1_7B = and:int(var_1_7B:int, ldc:int(1592426096))
            goto(Label_0110)
        }
        
        var_1_B7 = and:int(var_1_7B:int, ldc:int(-748697647))
        invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u8d90\ud36e\uc4d2\ua562\ubff1>(\u9255\u0c95\u4cd9\ube23\u760c::\u183a\u6435\u16f6\u8df4\ub19c\u7c6b), and:int(ldc:int(4933), ldc:int(1159)), xor:int(ldc:int(4196), ldc:int(4197)), xor:int(ldc:int(16536), ldc:int(16539)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u446c\u5140\uc238\u56bd\u7c6b>(\u9255\u0c95\u4cd9\ube23\u760c::\ud36e\u4f4a\u0800\u7d52\u5654\u965f), ldc:int(25), ldc:int(8), ldc:int(8))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u839e\u3d4b\u527a\uc2bd\u5d20\u97b7), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub83f\u72f1\u51b2\u494c\u0c95>(\u9255\u0c95\u4cd9\ube23\u760c::\u7ce1\u9937\u839e\u9af2\ub6ab\u8cae), and:int(ldc:int(18690), ldc:int(9251)), xor:int(ldc:int(9729), ldc:int(9728)), xor:int(ldc:int(2584), ldc:int(2586))))
        var_4_12F = stack_153_0 = invokestatic(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, getstatic(\u8c8a\ubefe\ucef1\u9033\u71f1::\u61a4\u760c\u392e\u836c\u4cd9\u93a2), p0, and(ldc(16385), ldc(2117)), and(ldc(6920), ldc(-23305)))
        stack_153_1 = getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8)
        
        if (logicalnot:boolean(p0:boolean)) {
            var_1_B7 = and:int(var_1_B7:int, ldc:int(-1261587532))
            stack_153_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u4975\u647c\u0b8e\uc4d2\u9a18\u3bd6)
        }
        else {
            stack_153_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8308\uae87\ub32d\u6cfe\u8350\u3c25)
        }
        
        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, stack_153_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_153_1:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa, stack_153_2:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>)
        
        if (p0:boolean) {
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc229\u88c5\u6d69\u7873\u0800\u6198, var_4_12F:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        }
        
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u873d\ub113\ud12e\ub18d\u4c2b\u946b, var_4_12F:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_4_12F:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, var_3_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(4566514), ldc:int(267827), p0:boolean, var_4_12F:\u67d0\u9a18\u6ec6\u8aa5\u1187))
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub70c\ube23\u6198\u64f2\u4492\u7d52() {
        var_2_89 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_3_CD : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_89 = invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u8d90\ud36e\uc4d2\ua562\ubff1>(\u9255\u0c95\u4cd9\ube23\u760c::\u183a\u6435\u16f6\u8df4\ub19c\u7c6b), ldc:int(15), and:int(ldc:int(8833), ldc:int(16397)), xor:int(ldc:int(16896), ldc:int(16899))))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7049\u3d4b\ufcaf\u120d\u120d\u98a4, var_2_89:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(10), xor:int(ldc:int(18564), ldc:int(18560)))
            var_3_CD = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokestatic:\u67d0\u9a18\u6ec6\u8aa5\u1187(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\ub70c\u36d3\u69d9\u8753\u7873\ua562), and:int[expected:boolean](ldc:int(-7894), ldc:int(1685)), xor:int[expected:boolean](ldc:int(16388), ldc:int(16389)), and:int[expected:boolean](ldc:int(11290), ldc:int(-11483))), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub6ab\u624e\u1187\u3d64\u7043\u7c6b)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u4975\u647c\u0b8e\uc4d2\u9a18\u3bd6)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uf995\u5140\u3a62\u4f52\u6cfe\ud523))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_3_CD:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, var_2_89:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(4445678), ldc:int(270131), and:int[expected:boolean](ldc:int(-2544), ldc:int(495)), var_3_CD:\u67d0\u9a18\u6ec6\u8aa5\u1187))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u839e\uc31c\u97b7\u8d90\u34df\ua3b4() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_3_C7 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7049\u3d4b\ufcaf\u120d\u120d\u98a4, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350, xor:int(ldc:int(24899), ldc:int(24902)), and:int(ldc:int(26625), ldc:int(1069)))
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uf9c5\uc229\u7d52\u946b\u5140>(\u9255\u0c95\u4cd9\ube23\u760c::\ua3b4\u446c\ub6ab\u600f\uc4d2\u6ec6), and:int(ldc:int(541), ldc:int(8197)), xor:int(ldc:int(-30336), ldc:int(-30335)), and:int(ldc:int(81), ldc:int(257))))
            var_3_C7 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokestatic:\u67d0\u9a18\u6ec6\u8aa5\u1187(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\ub70c\u36d3\u69d9\u8753\u7873\ua562), xor:int[expected:boolean](ldc:int(-32764), ldc:int(-32763)), xor:int[expected:boolean](ldc:int(29696), ldc:int(29697)), and:int[expected:boolean](ldc:int(19206), ldc:int(-19207))), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8308\uae87\ub32d\u6cfe\u8350\u3c25))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc229\u88c5\u6d69\u7873\u0800\u6198, var_3_C7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_3_C7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350, ldc:int(4445678), ldc:int(270131), xor:int[expected:boolean](ldc:int(4134), ldc:int(4135)), var_3_C7:\u67d0\u9a18\u6ec6\u8aa5\u1187))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u156b\u76bc\ub171\u385b\u52d3\u51fa(boolean p0) {
        var_1_61 : int
        var_3_D3 : \ua6bd\u4975\uc7fe\u3711\u8350
        stack_119_0 : float [generated]
        var_1_118 : int
        var_4_119 : float
        var_5_128 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_1_1F5 : int
        stack_208_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_1D2_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_1D2_1 : \ud51e\u927d\u69d9\u8df4\u6cfe [generated]
        stack_208_1 : float [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(1651224888), ldc:int(603908732))
            var_3_D3 = invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u839e\u3d4b\u527a\uc2bd\u5d20\u97b7), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u59ec\u8c8a\u8bb0\u760c\u71f1>(\u9255\u0c95\u4cd9\ube23\u760c::\u5f50\u8640\ud158\u760c\u8709\uc229), xor:int(ldc:int(13568), ldc:int(13569)), and:int(ldc:int(4385), ldc:int(9285)), xor:int(ldc:int(25664), ldc:int(25668)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uc29a\u946b\ucef1\u4e72\u64f2>(\u9255\u0c95\u4cd9\ube23\u760c::\u8bb0\u7873\ucef1\u4f4a\u4daf\u516c), ldc:int(15), xor:int(ldc:int(17504), ldc:int(17505)), xor:int(ldc:int(16404), ldc:int(16401)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub70c\ub19c\uc3e3\uae5d\u92ee>(\u9255\u0c95\u4cd9\ube23\u760c::\u600f\ub171\u92ff\u16f6\u4c2b\u7c6b), and:int(ldc:int(4149), ldc:int(577)), xor:int(ldc:int(48), ldc:int(49)), xor:int(ldc:int(2146), ldc:int(2144))))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_3_D3:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_3_D3:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uf9c5\uc229\u7d52\u946b\u5140>(\u9255\u0c95\u4cd9\ube23\u760c::\ua3b4\u446c\ub6ab\u600f\uc4d2\u6ec6), and:int(ldc:int(24597), ldc:int(4101)), and:int(ldc:int(8193), ldc:int(2403)), xor:int(ldc:int(-32382), ldc:int(-32381))))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1718527480))
                stack_119_0 = ldc:float(0.0f)
            }
            else {
                stack_119_0 = ldc:float(0.5f)
            }
            
            var_1_118 = and:int(var_1_61:int, ldc:int(-345773508))
            var_4_119 = stack_119_0:float
            var_5_128 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u8640\u97b7\u8389\u52d3\u9033\u0a06))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7d52\u624e\u61a4\u92ff\u385b\uc229))
            
            if (p0:boolean) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u3d4b\u7ce1\u7e3f\u527a\u3bd6\u527a))
            }
            
            var_1_1F5 = and:int(var_1_118:int, ldc:int(979873021))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub8be\u839e\u4ab3\u8389\ud217\uf9c5, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u156b\u6bb9\u3a62\ub32d\ubefe\u3bd6))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u71f1\u624e\ua068\u99f7\uc7fe\u51b2, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u51fa\u74b1\u3bc9\ucb79\u5db4\u6d69, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u71ae\u4ab3\ubcb0\u56bd\u7bad\u6c56, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc910\u12b2\u527a\uc4d2\u446c\u99f7, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            stack_208_0 = stack_1D2_0 = initobject(\u8389\uc29a\uc3e3\u69d9\u3504::<init>)
            
            if (p0:boolean) {
                stack_1D2_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)
                goto(Label_0460)
            }
            
            Label_0417:
            
            if (cmpeq:boolean(and:int(var_1_1F5:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0479)
            }
            
            var_1_1F5 = and:int(var_1_1F5:int, ldc:int(847173176))
            stack_1D2_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\u61a4\ua068\ubded\u76bc\u6cfe\u4d85)
            Label_0460:
            var_1_1F5 = and:int(var_1_1F5:int, ldc:int(2013255099))
            stack_208_0 = stack_1D2_0 = invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, stack_1D2_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_1D2_1:\ud51e\u927d\u69d9\u8df4\u6cfe), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5))
            
            if (p0:boolean) {
                stack_208_1 = ldc:float(-1.8f)
                return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, stack_208_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_208_1:float), ldc:float(0.1f)), var_4_119:float), getstatic:\u3d4b\uc2e8\ucb79\uc31c\uae5d(\u3d4b\uc2e8\ucb79\uc31c\uae5d::\u7049\u7c6b\u5f50\u4f52\u8308\u6c56)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(3750089)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, var_4_119:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_3_D3:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
            }
            
            Label_0479:
            
            if (cmpne:boolean(and:int(var_1_1F5:int, ldc:int(64)), ldc:int(0))) {
                var_1_1F5 = and:int(var_1_1F5:int, ldc:int(1117412627))
                goto(Label_0417)
            }
            
            var_1_1F5 = and:int(var_1_1F5:int, ldc:int(1987759164))
            stack_208_1 = ldc:float(-1.0f)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, stack_208_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_208_1:float), ldc:float(0.1f)), var_4_119:float), getstatic:\u3d4b\uc2e8\ucb79\uc31c\uae5d(\u3d4b\uc2e8\ucb79\uc31c\uae5d::\u7049\u7c6b\u5f50\u4f52\u8308\u6c56)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(3750089)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, var_4_119:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_3_D3:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_5_128:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u8d90\u52d3\u6d69\u6d69\u8d90\uf995(float p0, float p1, boolean p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 p3) {
        var_4_12D : int
        var_6_72 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_12D = and:int(ldc:int(522888846), ldc:int(-1619093410))
            var_6_72 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (p2:boolean) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u6b5f\u9255\u6ec6\ufcaf\uae87\u51fa))
                goto(Label_0210)
            }
            
            Label_0149:
            
            if (cmpeq:boolean(and:int(var_4_12D:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_12D = and:int(var_4_12D:int, ldc:int(-144336511))
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_4_12D:int, ldc:int(32)), ldc:int(0))) {
                var_4_12D = and:int(var_4_12D:int, ldc:int(-565031241))
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u4cd9\u9033\u494c\u56bd\ubefe\u4c04, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            }
            
            Label_0210:
            
            if (cmpeq:boolean(and:int(var_4_12D:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_12D = and:int(var_4_12D:int, ldc:int(-1161699467))
            }
            else {
                if (cmpne:boolean(and:int(var_4_12D:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_4_12D = and:int(var_4_12D:int, ldc:int(1607157726))
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                
                if (p2:boolean) {
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u9af2\u7bad\ud12e\ub6ab\u59ec\ua562))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub6ab\u51b2\u8308\u3e2a\u4f52\u36d3))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    goto(Label_0354)
                }
            }
            
            Label_0266:
            
            if (cmpeq:boolean(and:int(var_4_12D:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0210)
            }
            
            if (cmpne:boolean(and:int(var_4_12D:int, ldc:int(4096)), ldc:int(0))) {
                var_4_12D = and:int(var_4_12D:int, ldc:int(816533836))
                goto(Label_0149)
            }
            
            var_4_12D = and:int(var_4_12D:int, ldc:int(525515447))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc3e3\u9255\ub7dc\u67d0\u8aa5\u8aa5, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ud7e8\uc31c\u4f52\u3776\u99f7\uc84e, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            Label_0354:
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ud4fe\u5db4\u8bb0\u5654\u74b1\u64f2)), p0:float), p1:float), ldc:float(0.7f)), ldc:float(0.8f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.7f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, p3:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_6_72:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    private static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u6c52\u5d20\u76bc\u6198\u960f\u4bc8() {
        var_2_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            return:\ua6bd\u4975\uc7fe\u3711\u8350(var_2_69:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u4cd9\u6d69\u5d20\u47c2\u527a\uc7fe(float p0, float p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d90\u52d3\u6d69\u6d69\u8d90\uf995, p0:float, p1:float, and:int[expected:boolean](ldc:int(-15180), ldc:int(12619)), invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u8308\u3d64\u59ec\ub171\ud217\u760c, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokestatic:\ua6bd\u4975\uc7fe\u3711\u8350(\ub113\u927d\u7c6b\ubefe\u71ae::\u6c52\u5d20\u76bc\u6198\u960f\u4bc8), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u647c\ubb2b\ub83f\u67d0\u0c95>(\u9255\u0c95\u4cd9\ube23\u760c::\u8640\ub19c\u4f52\ubff1\u3e2a\u8389), xor:int(ldc:int(1543), ldc:int(1538)), and:int(ldc:int(17669), ldc:int(196)), and:int(ldc:int(149), ldc:int(4652)))))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u34df\u1833\ud4fe\u5bc4\u8640\ud171() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokestatic:\uc2e8\u9255\u647c\ud171\ubf56(\ub113\u927d\u7c6b\ubefe\u71ae::\u8d90\u52d3\u6d69\u6d69\u8d90\uf995, ldc:float(0.1f), ldc:float(0.4f), xor:int[expected:boolean](ldc:int(20548), ldc:int(20549)), invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokestatic:\ua6bd\u4975\uc7fe\u3711\u8350(\ub113\u927d\u7c6b\ubefe\u71ae::\u6c52\u5d20\u76bc\u6198\u960f\u4bc8), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5140\u7e3f\u67d0\u7873\u12cb>(\u9255\u0c95\u4cd9\ube23\u760c::\u2dcc\uc2bd\u34df\u8258\u5d20\u071d), xor:int(ldc:int(18434), ldc:int(18438)), xor:int(ldc:int(16417), ldc:int(16419)), and:int(ldc:int(8687), ldc:int(3))))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u34df\u7d52\u0800\uafe7\uc238\u1833(float p0, float p1, boolean p2, boolean p3, boolean p4, boolean p5) {
        var_6_113 : int
        var_8_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        stack_142_0 : float [generated]
        var_6_179 : int
        var_9_142 : float
        var_10_151 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_6_1C2 : int
        stack_215_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_215_1 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>> [generated]
        var_6_340 : int
        stack_356_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_30C_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_30C_1 : \ud51e\u927d\u69d9\u8df4\u6cfe [generated]
        stack_356_1 : float [generated]
        var_6_354 : int
        stack_3A0_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        expr_359 : \u8d90\ub102\ua6bd\u5d20\ubded [generated]
        stack_380_1 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_113 = and:int(ldc:int(-23503886), ldc:int(-51557377))
            var_8_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_8_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_8_6C:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u647c\ubb2b\ub83f\u67d0\u0c95>(\u9255\u0c95\u4cd9\ube23\u760c::\u8640\ub19c\u4f52\ubff1\u3e2a\u8389), ldc:int(8), and:int(ldc:int(11668), ldc:int(100)), and:int(ldc:int(10244), ldc:int(524)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5140\u7e3f\u67d0\u7873\u12cb>(\u9255\u0c95\u4cd9\ube23\u760c::\u2dcc\uc2bd\u34df\u8258\u5d20\u071d), xor:int(ldc:int(16714), ldc:int(16718)), and:int(ldc:int(674), ldc:int(1026)), xor:int(ldc:int(2112), ldc:int(2115)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u416d\u4179\u5db4\u4179\u839e>(\u9255\u0c95\u4cd9\ube23\u760c::\ubff1\uafe7\ua068\uc29a\ud217\u494c), ldc:int(8), xor:int(ldc:int(2304), ldc:int(2306)), and:int(ldc:int(4108), ldc:int(646))))
            
            if (logicalnot:boolean(p2:boolean)) {
                if (logicalnot:boolean(p3:boolean)) {
                    invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u8308\u3d64\u59ec\ub171\ud217\u760c, var_8_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_6_113:int, ldc:int(32768)), ldc:int(0))) {
                    var_6_113 = and:int(var_6_113:int, ldc:int(931994599))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_8_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
                    
                    if (p2:boolean) {
                        stack_142_0 = ldc:float(-0.5f)
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_6_113:int, ldc:int(524288)), ldc:int(0))) {
                    var_6_113 = and:int(var_6_113:int, ldc:int(-1210441755))
                    stack_142_0 = ldc:float(0.25f)
                    looporswitchbreak()
                }
                
                var_6_113 = and:int(var_6_113:int, ldc:int(-1300910999))
            }
            
            var_6_179 = and:int(var_6_113:int, ldc:int(1979654131))
            var_9_142 = stack_142_0:float
            var_10_151 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            
            if (p4:boolean) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u71ae\u4ab3\u8d90\ube23\ud36e\u8aa5))
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0680)
                }
                
                if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0606)
                }
                
                if (cmpne:boolean(and:int(var_6_179:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_179 = and:int(var_6_179:int, ldc:int(-156303377))
                    
                    if (p5:boolean) {
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\uc238\u47c2\u3e75\u6198\uc3e3\u392e))
                    }
                }
                
                Label_0384:
                
                if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(524288)), ldc:int(0))) {
                    var_6_179 = and:int(var_6_179:int, ldc:int(1058294757))
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_6_179:int, ldc:int(32768)), ldc:int(0))) {
                    var_6_179 = and:int(var_6_179:int, ldc:int(1379759805))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(524288)), ldc:int(0))) {
                        var_6_179 = and:int(var_6_179:int, ldc:int(2021004996))
                        loopcontinue()
                    }
                    
                    var_6_1C2 = and:int(var_6_179:int, ldc:int(-18088992))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    stack_215_0 = var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187
                    
                    if (logicalnot:boolean(p3:boolean)) {
                        var_6_1C2 = and:int(var_6_1C2:int, ldc:int(-1260498971))
                        stack_215_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4)
                    }
                    else {
                        stack_215_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06)
                    }
                    
                    var_6_179 = and:int(var_6_1C2:int, ldc:int(-3608599))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, stack_215_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_215_1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u385b\u51fa\ube23\ub18d\u92ee\u494c, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8413\u1833\u34df\u99f7\u5f50\u416d, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u62da\u965f\u836c\u5140\uc31c\uae87, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p2:boolean) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ua068\u071d\u67d0\u3a62\ucef1\u983f, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        goto(Label_0680)
                    }
                }
                
                Label_0606:
                
                if (cmpne:boolean(and:int(var_6_179:int, ldc:int(2097152)), ldc:int(0))) {
                    var_6_179 = and:int(var_6_179:int, ldc:int(120922924))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(8388608)), ldc:int(0))) {
                        var_6_179 = and:int(var_6_179:int, ldc:int(907869033))
                        goto(Label_0384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_6_179 = and:int(var_6_179:int, ldc:int(1039077352))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub113\u6198\u69d9\ubcb0\u385b\u64ab, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                }
                
                Label_0680:
                
                if (cmpne:boolean(and:int(var_6_179:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0606)
                }
                
                if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0384)
                }
                
                if (cmpeq:boolean(and:int(var_6_179:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_6_179 = and:int(var_6_179:int, ldc:int(-2065899173))
            }
            
            var_6_340 = and:int(var_6_179:int, ldc:int(-1131508747))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            stack_356_0 = stack_30C_0 = initobject(\u8389\uc29a\uc3e3\u69d9\u3504::<init>)
            
            if (p2:boolean) {
                stack_30C_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\u61a4\ua068\ubded\u76bc\u6cfe\u4d85)
                goto(Label_0772)
            }
            
            Label_0742:
            
            if (cmpne:boolean(and:int(var_6_340:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0806)
            }
            
            var_6_340 = and:int(var_6_340:int, ldc:int(2094005244))
            stack_30C_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)
            Label_0772:
            var_6_340 = and:int(var_6_340:int, ldc:int(-21286935))
            stack_356_0 = stack_30C_0 = invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, stack_30C_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_30C_1:\ud51e\u927d\u69d9\u8df4\u6cfe), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d)), p0:float), p1:float), var_9_142:float)
            
            if (p2:boolean) {
                stack_356_1 = ldc:float(0.4f)
                goto(Label_0846)
            }
            
            Label_0806:
            
            if (cmpne:boolean(and:int(var_6_340:int, ldc:int(4)), ldc:int(0))) {
                var_6_340 = and:int(var_6_340:int, ldc:int(-333789467))
                goto(Label_0742)
            }
            
            var_6_340 = and:int(var_6_340:int, ldc:int(-172078085))
            stack_356_1 = ldc:float(0.8f)
            Label_0846:
            var_6_354 = and:int(var_6_340:int, ldc:int(904507366))
            stack_3A0_0 = invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, stack_356_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_356_1:float)
            expr_359 = initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_6_354 = and:int(var_6_354:int, ldc:int(898423785))
                stack_380_1 = ldc:int(4159204)
            }
            else {
                stack_380_1 = ldc:int(4020182)
            }
            
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, stack_3A0_0:\u8389\uc29a\uc3e3\u69d9\u3504, invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, expr_359:\u8d90\ub102\ua6bd\u5d20\ubded, stack_380_1:int), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, var_9_142:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_8_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_10_151:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u760c\uc31c\ubcb0\u7bad\u67d0\u8cae(float p0, float p1, boolean p2) {
        var_3_61 : int
        var_5_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_6_82 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        stack_CC_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_CC_1 : \u527a\u5f50\u92ff\ud36e\u3e75\u51fa [generated]
        stack_CC_2 : \ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(868772094), ldc:int(-67372035))
            var_5_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            var_6_82 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u600f\u8350\u0800\u4e72\u5140\u1187))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            stack_CC_0 = var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187
            stack_CC_1 = getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1074861828))
                stack_CC_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u6198\ubb2b\u56bd\uc910\u71ae\u0a06)
            }
            else {
                stack_CC_2 = getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u5654\u7043\u8350\u836c\u6bb9\u8389)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, stack_CC_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_CC_1:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa, stack_CC_2:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u4cd9\u9033\u494c\u56bd\ubefe\u4c04, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ud7e8\uc31c\u4f52\u3776\u99f7\uc84e, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ud4fe\u5db4\u8bb0\u5654\u74b1\u64f2)), p0:float), p1:float), ldc:float(0.7f)), ldc:float(0.8f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u6ec6\u98a4\u64ab\uf9c5\u527a\u6c56, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.7f))), getstatic:\u4d85\ubf56\u67e9\u92ff\u516c(\u4d85\ubf56\u67e9\u92ff\u516c::\u97b7\u56bd\u3a62\u12cb\u67d0\ubcb0)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_6_82:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u5245\u647c\u7af6\uc7fe\ud51e\uceb8(float p0, float p1, boolean p2) {
        var_3_14E : int
        var_5_69 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_6_AA : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_14E = and:int(ldc:int(614004413), ldc:int(-1214618579))
            var_5_69 = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3d64\u6b0d\u12b2\ud523\uc9f6\uc246, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u5db4\u71f1\u600f\u67d0\u0b8e>(\u9255\u0c95\u4cd9\ube23\u760c::\u4cd9\u92ee\u3711\ubded\u3bd6\ua068), xor:int(ldc:int(-30588), ldc:int(-30587)), xor:int(ldc:int(8784), ldc:int(8785)), xor:int(ldc:int(12360), ldc:int(12361))))
            var_6_AA = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u9937\uc9f6\u6198\ub1b9\u0b8e\uc2e8))
            
            if (logicalnot:boolean(p2:boolean)) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8709\u16f6\uff55\u67e9\ub7dc\u0b8e))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_14E:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0304)
                }
                
                if (cmpne:boolean(and:int(var_3_14E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_14E = and:int(var_3_14E:int, ldc:int(-28117829))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8308\u51fa\uc87f\u760c\u8df4\u5654))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u74b1\uc29a\u76bc\u93a2\u4f52\u7af6))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (logicalnot:boolean(p2:boolean)) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u92ff\u7049\u624e\u92ff\ucb79, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    }
                }
                
                Label_0225:
                
                if (cmpne:boolean(and:int(var_3_14E:int, ldc:int(256)), ldc:int(0))) {
                    var_3_14E = and:int(var_3_14E:int, ldc:int(-688489149))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_14E:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_14E = and:int(var_3_14E:int, ldc:int(-1092911749))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc910\ud523\ud7e8\u946b\u516c\ub18d, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u4cd9\u527a\uc2e8\u6b0d\uc4d2\ucb79, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ubcb0\u416d\ufe34\ub18d\u7873\u1187, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (p2:boolean) {
                        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u92ff\u7049\u624e\u92ff\ucb79, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                        looporswitchbreak()
                    }
                }
                
                Label_0304:
                
                if (cmpeq:boolean(and:int(var_3_14E:int, ldc:int(32)), ldc:int(0))) {
                    var_3_14E = and:int(var_3_14E:int, ldc:int(-98985959))
                    goto(Label_0225)
                }
                
                if (cmpeq:boolean(and:int(var_3_14E:int, ldc:int(256)), ldc:int(0))) {
                    var_3_14E = and:int(var_3_14E:int, ldc:int(801042153))
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ubefe\u760c\u93a2\u3504\u9a18\u69d9))
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u0a06\u4c2b\u92ee\u4daf\u6fb0\ud36e)), p0:float), p1:float), ldc:float(0.8f)), ldc:float(0.9f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u6ec6\u98a4\u64ab\uf9c5\u527a\u6c56, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4f4a\u5bc4\u12cb\ub8be\ufcaf\ubf56, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(6388580)), ldc:int(2302743)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.8f))), ldc:int(6975545)), getstatic:\u4d85\ubf56\u67e9\u92ff\u516c(\u4d85\ubf56\u67e9\u92ff\u516c::\u4cd9\u836c\uf9c5\u4975\u8aa5\u3711)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_5_69:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_6_AA:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ubff1\u0a06\u4daf\uc2bd\ub113\u0c95(float p0, float p1, boolean p2, boolean p3) {
        var_4_63 : int
        var_6_72 : \ua6bd\u4975\uc7fe\u3711\u8350
        expr_79 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_A1_1 : \u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf> [generated]
        var_4_B9 : int
        var_7_A4 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_4_DE : int
        stack_13F_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_13F_1 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = and:int(ldc:int(-1777690763), ldc:int(-690489443))
            var_6_72 = invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), ldc:float(0.07f))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc3e3\u0a06\ud171\ub8be\u8389\u8d98, var_6_72:\ua6bd\u4975\uc7fe\u3711\u8350)
            expr_79 = initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1073399693))
                stack_A1_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d)
            }
            else {
                stack_A1_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u3c25\uae87\u92ee\u5654\u6cfe\u873d)
            }
            
            var_4_B9 = and:int(var_4_63:int, ldc:int(-1636044825))
            var_7_A4 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, expr_79:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_A1_1:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
            
            if (logicalnot:boolean(p2:boolean)) {
                if (logicalnot:boolean(p3:boolean)) {
                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u839e\u8c8a\u8aa5\ub8be\u0b8e\u416d)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\uc238\u47c2\u3e75\u6198\uc3e3\u392e))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_B9:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_B9 = and:int(var_4_B9:int, ldc:int(-554977481))
                    invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
                    
                    if (logicalnot:boolean(p2:boolean)) {
                        if (logicalnot:boolean(p3:boolean)) {
                            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_B9:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_B9 = and:int(var_4_B9:int, ldc:int(115366124))
            }
            
            var_4_DE = and:int(var_4_B9:int, ldc:int(396867397))
            stack_13F_0 = var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187
            
            if (logicalnot:boolean(p3:boolean)) {
                var_4_DE = and:int(var_4_DE:int, ldc:int(1603983229))
                stack_13F_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4)
            }
            else {
                stack_13F_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06)
            }
            
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, stack_13F_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_13F_1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (p2:boolean) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u836c\u47c2\ufcaf\u392e\u392e\uceb8))
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u3d64\u7d52\u16f6\u0a06\u8bb0\u494c))
            }
            
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ud51e\u416d\u4cd9\u92ff\u6d69\uff55, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\u61a4\ua068\ubded\u76bc\u6cfe\u4d85)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u624e\u4e72\u6ec6\u6ec6\u7006\ud12e)), p0:float), p1:float), ldc:float(0.0f)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.0f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_6_72:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_7_A4:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u8350\uafe7\u960f\u5654\u6435\u624e(float p0, float p1, float p2, int p3, boolean p4) {
        var_5_63 : int
        var_7_B6 : \ua6bd\u4975\uc7fe\u3711\u8350
        var_8_108 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_5_163 : int
        expr_16A : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_1A6_1 : \ud51e\u927d\u69d9\u8df4\u6cfe [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_63 = and:int(ldc:int(1059004200), ldc:int(1846958715))
            var_7_B6 = invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u839e\u3d4b\u527a\uc2bd\u5d20\u97b7), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u59ec\u8c8a\u8bb0\u760c\u71f1>(\u9255\u0c95\u4cd9\ube23\u760c::\u5f50\u8640\ud158\u760c\u8709\uc229), xor:int(ldc:int(289), ldc:int(291)), xor:int(ldc:int(2049), ldc:int(2048)), xor:int(ldc:int(-21502), ldc:int(-21498)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u3c25\uc7fe\u12cb\u836c\u6b0d\ua3b4), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uc29a\u946b\ucef1\u4e72\u64f2>(\u9255\u0c95\u4cd9\ube23\u760c::\u8bb0\u7873\ucef1\u4f4a\u4daf\u516c), xor:int(ldc:int(10312), ldc:int(10317)), and:int(ldc:int(5237), ldc:int(521)), xor:int(ldc:int(466), ldc:int(471))))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_7_B6:\ua6bd\u4975\uc7fe\u3711\u8350)
            invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_7_B6:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uf9c5\uc229\u7d52\u946b\u5140>(\u9255\u0c95\u4cd9\ube23\u760c::\ua3b4\u446c\ub6ab\u600f\uc4d2\u6ec6), ternaryop:int(p4:boolean, and:int(ldc:int(2577), ldc:int(4107)), ldc:int(100)), xor:int(ldc:int(1346), ldc:int(1347)), xor:int(ldc:int(8193), ldc:int(8192))))
            var_8_108 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u5f50\u9937\u8df4\u3d4b\ud36e\u873d))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8308\u51fa\uc87f\u760c\u8df4\u5654))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc910\u12b2\u527a\uc4d2\u446c\u99f7, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            
            if (logicalnot:boolean(p4:boolean)) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub7dc\u4c04\u64ab\u3a62\ufcaf\u3c25))
            }
            
            var_5_163 = and:int(var_5_63:int, ldc:int(-299745538))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            expr_16A = initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>)
            
            if (logicalnot:boolean(p4:boolean)) {
                var_5_163 = and:int(var_5_163:int, ldc:int(1864089193))
                stack_1A6_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)
            }
            else {
                stack_1A6_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\u61a4\ua068\ubded\u76bc\u6cfe\u4d85)
            }
            
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, expr_16A:\u8389\uc29a\uc3e3\u69d9\u3504, stack_1A6_1:\ud51e\u927d\u69d9\u8df4\u6cfe), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u6435\u74b1\u7af6\u5245\u6b0d\uc87f)), p0:float), p1:float), p2:float), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), p3:int), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, p2:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_7_B6:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_8_108:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u960f\u8308\uae5d\u36d3\u71ae\u9937(float p0, float p1, float p2, float p3, int p4, boolean p5, boolean p6) {
        var_7_63 : int
        var_9_6C : \ua6bd\u4975\uc7fe\u3711\u8350
        var_7_79 : int
        expr_80 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_E4_1 : \u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf> [generated]
        var_7_FD : int
        var_10_E7 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_7_140 : int
        stack_166_0 : \u67d0\u9a18\u6ec6\u8aa5\u1187 [generated]
        stack_166_1 : \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>> [generated]
        var_7_1FA : int
        stack_211_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_1E3_0 : \u8389\uc29a\uc3e3\u69d9\u3504 [generated]
        stack_1E3_1 : \ud51e\u927d\u69d9\u8df4\u6cfe [generated]
        stack_211_1 : \uf995\u7049\u8258\u5654\u718f [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_7_63 = and:int(ldc:int(594996280), ldc:int(-889260171))
        var_9_6C = initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>)
        
        if (logicalnot:boolean(p6:boolean)) {
            if (logicalnot:boolean(p5:boolean)) {
                invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, var_9_6C:\ua6bd\u4975\uc7fe\u3711\u8350, getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u9255\u3bc9\u5140\u3c25\u51b2>(\u9255\u0c95\u4cd9\ube23\u760c::\u7049\u7049\u51fa\ua3b4\u392e\u7af6), and:int(ldc:int(8423), ldc:int(18965)), and:int(ldc:int(8323), ldc:int(546)), xor:int(ldc:int(-32634), ldc:int(-32637))))
            }
        }
        
        var_7_79 = and:int(var_7_63:int, ldc:int(1584582205))
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u3504\u873d\u34df\u9255\u71ae\u92ff, var_9_6C:\ua6bd\u4975\uc7fe\u3711\u8350)
        expr_80 = initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>)
        
        if (logicalnot:boolean(p6:boolean)) {
            var_7_79 = and:int(var_7_79:int, ldc:int(578278777))
            stack_E4_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u59ec\uc910\ubcb0\u3776\u965f\u6ec6)
        }
        else {
            stack_E4_1 = getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u8aa5\ud36e\u624e\u5fe1\ub18d\u600f)
        }
        
        var_7_FD = and:int(var_7_79:int, ldc:int(1610018293))
        var_10_E7 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, expr_80:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_E4_1:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>)
        
        if (p6:boolean) {
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7006\u8308\u8258\uc29a\u3a62\u62da, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            goto(Label_0294)
        }
        
        Label_0238:
        
        if (cmpne:boolean(and:int(var_7_FD:int, ldc:int(16)), ldc:int(0))) {
            var_7_FD = and:int(var_7_FD:int, ldc:int(-948710218))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8308\u51fa\uc87f\u760c\u8df4\u5654))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ud171\ud51e\ubded\u120d\u3c25\u1187))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u34df\u12cb\u99f7\u3bd6\uc87f\uc2bd))
        }
        
        Label_0294:
        
        if (cmpeq:boolean(and:int(var_7_FD:int, ldc:int(32)), ldc:int(0))) {
            var_7_FD = and:int(var_7_FD:int, ldc:int(130851981))
            goto(Label_0238)
        }
        
        var_7_140 = and:int(var_7_FD:int, ldc:int(1392246771))
        stack_166_0 = var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (logicalnot:boolean(p6:boolean)) {
            var_7_140 = and:int(var_7_140:int, ldc:int(712171453))
            stack_166_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4)
        }
        else {
            stack_166_1 = getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0c95\u3bc9\u56bd\ub6ab\u51b2\u0a06)
        }
        
        var_7_1FA = and:int(var_7_140:int, ldc:int(-1754085447))
        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, stack_166_0:\u67d0\u9a18\u6ec6\u8aa5\u1187, stack_166_1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6bb9\uceb8\uceb8\u92ff\uc3e3\u5bc4, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u40a9\u4c2b\u59ec\u6198\uceb8\u9a18, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6d69\ub18d\u4cd9\uf94d\u5140\u3d64, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8640\u1187\u12b2\u6198\u4c2b\u4975, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uc84e\u8cae\u0a06\ua068\uc246\ufcaf, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uae5d\ud51e\u6c56\u839e\u516c\ubded, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u6435\uc229\u839e\u72f1\ud158\u446c, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u7e3f\u98a4\u4f4a\u1833\u8df4\u8df4, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u67d0\uc84e\u61a4\uc246\u759a\u4c2b, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\ub7dc\u92ee\u983f\u97e6\u3d4b\u8709, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uafe7\u5fe1\ub19c\uc84e\u8aa5\u5245, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        stack_211_0 = stack_1E3_0 = initobject(\u8389\uc29a\uc3e3\u69d9\u3504::<init>)
        
        if (p5:boolean) {
            stack_1E3_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\u61a4\ua068\ubded\u76bc\u6cfe\u4d85)
            goto(Label_0475)
        }
        
        Label_0434:
        
        if (cmpeq:boolean(and:int(var_7_1FA:int, ldc:int(1048576)), ldc:int(0))) {
            var_7_1FA = and:int(var_7_1FA:int, ldc:int(-1454120761))
            goto(Label_0491)
        }
        
        var_7_1FA = and:int(var_7_1FA:int, ldc:int(-470426125))
        stack_1E3_1 = getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf)
        Label_0475:
        var_7_1FA = and:int(var_7_1FA:int, ldc:int(-361171011))
        stack_211_0 = stack_1E3_0 = invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, stack_1E3_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_1E3_1:\ud51e\u927d\u69d9\u8df4\u6cfe)
        
        if (p6:boolean) {
            stack_211_1 = getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u3bd6\ub7dc\ud51e\u3d4b\u71f1\u4f52)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, stack_211_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_211_1:\uf995\u7049\u8258\u5654\u718f), p0:float), p1:float), p2:float), p3:float), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), p4:int), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, p2:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_9_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        Label_0491:
        
        if (cmpeq:boolean(and:int(var_7_1FA:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0434)
        }
        
        var_7_1FA = and:int(var_7_1FA:int, ldc:int(1995763390))
        stack_211_1 = getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\ud4fe\u120d\u99f7\u3d64\uc4d2\u4f4a)
        return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, stack_211_0:\u8389\uc29a\uc3e3\u69d9\u3504, stack_211_1:\uf995\u7049\u8258\u5654\u718f), p0:float), p1:float), p2:float), p3:float), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), p4:int), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, p2:float)), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, var_9_6C:\ua6bd\u4975\uc7fe\u3711\u8350)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_10_E7:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u3bd6\u8389\u873d\u7049\ua562\u527a() {
        var_2_6F : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_6F = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\ud171\ufcaf\u516c\ub70c\ud4fe\u836c))
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_2_6F:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71ae\u62da\u9a18\u4f4a\u8413\u51b2), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u5db4\u6bb9\ub1b9\u8bb0\u7bad\u5d20))
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u3bd6\ub7dc\ud51e\u3d4b\u71f1\u4f52)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(0.5f)), ldc:float(0.5f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(12638463)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(0.5f))), getstatic:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::\u4cd9\u98a4\u3a62\ua068\u183a\u6d69)))), getstatic:\u6198\uff55\u56bd\u8308\u4cd9(\u6198\uff55\u56bd\u8308\u4cd9::\u8d90\u7043\ubff1\u12b2\u0c95\u4975)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_2_6F:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u8709\ube23\ub113\u120d\u1833\ubff1() {
        var_2_136 : \u6198\uff55\u56bd\u8308\u4cd9
        var_3_168 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_136 = invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u6cfe\ucb79\uc229\ua61f\ud36e>(\u9255\u0c95\u4cd9\ube23\u760c::\u516c\u5fe1\ufe34\u4bc8\u8308\u8d90), ldc:int(50), and:int(ldc:int(22020), ldc:int(8340)), and:int(ldc:int(19492), ldc:int(142)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u1187\uae5d\u8308\u527a\u51fa>(\u9255\u0c95\u4cd9\ube23\u760c::\uc3e3\uc3e3\ud4fe\u97e6\uc87f\ub83f), ldc:int(100), xor:int(ldc:int(18443), ldc:int(18447)), and:int(ldc:int(1029), ldc:int(16654)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ud4fe\uf94d\uc9f6\ud12e\u4daf>(\u9255\u0c95\u4cd9\ube23\u760c::\u36d3\u3776\ua562\u494c\u9255\ua61f), and:int(ldc:int(903), ldc:int(25618)), xor:int(ldc:int(16384), ldc:int(16388)), and:int(ldc:int(36), ldc:int(1860)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u3776\ua562\uc3e3\u92ff>(\u9255\u0c95\u4cd9\ube23\u760c::\uceb8\u6ec6\uf995\ub83f\ud523\u99f7), xor:int(ldc:int(-15868), ldc:int(-15867)), xor:int(ldc:int(8194), ldc:int(8198)), xor:int(ldc:int(8449), ldc:int(8453)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u156b\u392e\u34df\u718f\u6ec6>(\u9255\u0c95\u4cd9\ube23\u760c::\u624e\u6cfe\ub1b9\u7d52\u4179\u5fe1), ldc:int(15), and:int(ldc:int(9573), ldc:int(16404)), xor:int(ldc:int(6144), ldc:int(6148)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:int(60), xor:int(ldc:int(20616), ldc:int(20617)), xor:int(ldc:int(521), ldc:int(523)))))
            var_3_168 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6d99\ubff1\u72f1\u9255\ubded\ub32d, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\uc87f\u0b8e\ud4fe\ub171\ub70c\u3e2a)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u69d9\u5bc4\u34df\u3d4b\u6b5f\u416d)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ufe34\ub102\u8bb0\u965f\u0b8e\uc3e3)), getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee), getstatic:\u760c\ubded\uff55\u6d69\u4179<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u873d\u183a\u51fa\u5fe1\u51b2::\u97b7\ub18d\u760c\ub113\u6198\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u67e9\u7d52\u156b\ud12e\ub8be\u3711))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_3_168:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_3_168:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8350\uc2e8\u8413\u7c6b\u759a\u8df4)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u76bc\u416d\u0a06\u3bd6\u98a4\u718f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud12e\uff55\u40a9\ube23\u12b2\u97b7)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud7e8\uc910\u3776\u88c5\u8df4\u3a62)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc3e3\ubff1\u8640\u5bc4\ubff1\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc31c\u156b\u61a4\u97e6\u92ee\u6fb0)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uae5d\u61a4\uc910\ucb79\u3bd6\uc2e8)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8bb0\u92ee\u76bc\u6cfe\u647c\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc4d2\ua6bd\u8aa5\u76bc\u12cb\u927d))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u97b7\u76bc\ua562\u1833\u7006, var_3_168:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud171\u97e6\u392e\u8389\u99f7\ud36e, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud4fe\u51fa\ud36e\u3dd3\u8709\u8389, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(3344392)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u965f\u36d3\ub1b9\u71ae\u8308\uc29a)), initobject:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ucb79\u69d9\ud171\u7af6\u9a18\uc29a), and:int(ldc:int(6002), ldc:int(8057)), ldc:int(8), ldc:double(2.0))), initobject:\uae87\u36d3\uae87\u1187\u3dd3(\uae87\u36d3\uae87\u1187\u3dd3::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u385b\u4c2b\u4d85\u6b5f\ud171\uc9f6), ldc:double(0.0111))), invokestatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u7873\u40a9\u446c\u7ce1\u6c52\u4179, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u98a4\u0c95\u3e2a\ubcb0\u8cae\ud217))))), var_2_136:\u6198\uff55\u56bd\u8308\u4cd9), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_3_168:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u983f\u5140\uc238\u624e\ud51e\ud7e8() {
        var_6_12A : \u6198\uff55\u56bd\u8308\u4cd9
        var_7_1BD : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_12A = invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u97e6\u56bd\u6b5f\u494c\ub19c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8350\u8d90\u3bc9\ufe34\u3504\u6cfe), ldc:int(20), xor:int(ldc:int(9217), ldc:int(9220)), and:int(ldc:int(18477), ldc:int(8261)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u6cfe\ucb79\uc229\ua61f\ud36e>(\u9255\u0c95\u4cd9\ube23\u760c::\u516c\u5fe1\ufe34\u4bc8\u8308\u8d90), ldc:int(50), xor:int(ldc:int(3585), ldc:int(3589)), and:int(ldc:int(8973), ldc:int(18628)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u3776\ua562\uc3e3\u92ff>(\u9255\u0c95\u4cd9\ube23\u760c::\uceb8\u6ec6\uf995\ub83f\ud523\u99f7), xor:int(ldc:int(-32704), ldc:int(-32703)), xor:int(ldc:int(16417), ldc:int(16421)), and:int(ldc:int(6308), ldc:int(24836)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:int(60), xor:int(ldc:int(90), ldc:int(91)), and:int(ldc:int(13715), ldc:int(578)))), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u97e6\u56bd\u6b5f\u494c\ub19c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8350\u8d90\u3bc9\ufe34\u3504\u6cfe), ldc:double(0.7), ldc:double(0.15)), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u6cfe\ucb79\uc229\ua61f\ud36e>(\u9255\u0c95\u4cd9\ube23\u760c::\u516c\u5fe1\ufe34\u4bc8\u8308\u8d90), ldc:double(0.7), ldc:double(0.15)), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u3776\ua562\uc3e3\u92ff>(\u9255\u0c95\u4cd9\ube23\u760c::\uceb8\u6ec6\uf995\ub83f\ud523\u99f7), ldc:double(0.7), ldc:double(0.15)), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:double(0.7), ldc:double(0.15)))
            var_7_1BD = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6d99\ubff1\u72f1\u9255\ubded\ub32d, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u8aa5\u4c04\u392e\u071d\u7330\ucfaf)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u98a4\ud36e\u92ff\ubff1\uc3e3\u4d85)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u69d9\u5bc4\u34df\u3d4b\u6b5f\u416d)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ufe34\ub102\u8bb0\u965f\u0b8e\uc3e3)), getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee), getstatic:\u760c\ubded\uff55\u6d69\u4179<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u873d\u183a\u51fa\u5fe1\u51b2::\u97b7\ub18d\u760c\ub113\u6198\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u67e9\u7d52\u156b\ud12e\ub8be\u3711)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c2b\ufe34\uc9f6\u4f52\u9033\u6435), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u3504\u8d90\uc2e8\u6d69\u8d90\u9937)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8350\uc2e8\u8413\u7c6b\u759a\u8df4)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud7e8\uc910\u3776\u88c5\u8df4\u3a62)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc3e3\ubff1\u8640\u5bc4\ubff1\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc238\uae87\u7af6\u6ec6\u120d\ub171)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u76bc\u416d\u0a06\u3bd6\u98a4\u718f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud12e\uff55\u40a9\ube23\u12b2\u97b7)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8bb0\u92ee\u76bc\u6cfe\u647c\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc4d2\ua6bd\u8aa5\u76bc\u12cb\u927d)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u760c\u4e72\u839e\u600f\u9033\u8df4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u97b7\u76bc\ua562\u1833\u7006, var_7_1BD:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud171\u97e6\u392e\u8389\u99f7\ud36e, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud4fe\u51fa\ud36e\u3dd3\u8709\u8389, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u8d90\u718f\u7330\u5fe1\uc4d2\u69d9, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(1787717)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), initobject:\u7049\u5fe1\u4179\u9937\ubded(\u7049\u5fe1\u4179\u9937\ubded::<init>, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ub83f\u7ce1\ud523\u67d0\u8c8a\u8389), ldc:float(0.00625f))), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u0800\u120d\u52d3\u0a06\u4e72\u67e9)), initobject:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ub8be\u8cae\u3776\ua562\u4d85\u6b5f), xor:int(ldc:int(21996), ldc:int(17052)), ldc:int(8), ldc:double(2.0))), initobject:\uae87\u36d3\uae87\u1187\u3dd3(\uae87\u36d3\uae87\u1187\u3dd3::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u51b2\uafe7\u3bc9\u8cae\ud171\u8753), ldc:double(0.0111))), invokestatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u7873\u40a9\u446c\u7ce1\u6c52\u4179, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8709\ub70c\u97b7\ucef1\u72f1\uae5d))))), var_6_12A:\u6198\uff55\u56bd\u8308\u4cd9), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_7_1BD:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u7bad\ucfaf\ub171\u0800\u97b7\u4c2b() {
        var_2_CC : \u6198\uff55\u56bd\u8308\u4cd9
        var_3_188 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_CC = invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u6cfe\ucb79\uc229\ua61f\ud36e>(\u9255\u0c95\u4cd9\ube23\u760c::\u516c\u5fe1\ufe34\u4bc8\u8308\u8d90), ldc:int(40), xor:int(ldc:int(600), ldc:int(601)), and:int(ldc:int(1795), ldc:int(8221)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ud4fe\uf94d\uc9f6\ud12e\u4daf>(\u9255\u0c95\u4cd9\ube23\u760c::\u36d3\u3776\ua562\u494c\u9255\ua61f), ldc:int(100), xor:int(ldc:int(22016), ldc:int(22018)), xor:int(ldc:int(837), ldc:int(832)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:int(60), xor:int(ldc:int(-32239), ldc:int(-32240)), xor:int(ldc:int(1664), ldc:int(1666)))))
            var_3_188 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6d99\ubff1\u72f1\u9255\ubded\ub32d, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u6435\u72f1\u36d3\u8d90\ud7e8\uc7fe)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u69d9\u5bc4\u34df\u3d4b\u6b5f\u416d)), getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee), getstatic:\u760c\ubded\uff55\u6d69\u4179<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u873d\u183a\u51fa\u5fe1\u51b2::\u97b7\ub18d\u760c\ub113\u6198\u516c)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u6fb0\u385b\u3711\u72f1\u760c\u8df4)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u5bc4\u7af6\u4c04\u9af2\u494c\u56bd)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u4f4a\u8640\u3504\u6fb0\u760c\u9a18)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub83f\u4f4a\ud217\u6b0d\ubff1\uf995)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u6d69\ud171\u3a62\u3c25\u1187\uc7fe)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u97e6\u47c2\u3bc9\u7330\u7006\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u16f6\u51b2\u5654\u446c\u61a4\u960f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u76bc\u416d\u0a06\u3bd6\u98a4\u718f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud12e\uff55\u40a9\ube23\u12b2\u97b7)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud7e8\uc910\u3776\u88c5\u8df4\u3a62)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc3e3\ubff1\u8640\u5bc4\ubff1\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc31c\u156b\u61a4\u97e6\u92ee\u6fb0)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uae5d\u61a4\uc910\ucb79\u3bd6\uc2e8)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8bb0\u92ee\u76bc\u6cfe\u647c\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u3711\u9a18\u4e72\uc4d2\u8cae\u97e6)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u4179\ud523\u99f7\u385b\ub19c\ud7e8)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud523\u7c6b\u88c5\u3bc9\u960f\u760c))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u8258\ub1b9\u74b1\u385b\u4daf\u8389, var_3_188:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud171\u97e6\u392e\u8389\u99f7\ud36e, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud4fe\u51fa\ud36e\u3dd3\u8709\u8389, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u8d90\u718f\u7330\u5fe1\uc4d2\u69d9, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(4341314)), ldc:int(6840176)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), initobject:\u7049\u5fe1\u4179\u9937\ubded(\u7049\u5fe1\u4179\u9937\ubded::<init>, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5654\u6435\u3711\u6fb0\ub19c\ud36e), ldc:float(0.118093334f))), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7bad\u7d52\u6ec6\ua3b4\u5bc4\uf995)), initobject:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc9f6\u4f4a\u8308\ud36e\u6d69\u5f50), and:int(ldc:int(16368), ldc:int(22389)), ldc:int(8), ldc:double(2.0))), initobject:\uae87\u36d3\uae87\u1187\u3dd3(\uae87\u36d3\uae87\u1187\u3dd3::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3a62\u8df4\uf995\ubefe\u4179\u5bc4), ldc:double(0.0111))), invokestatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u7873\u40a9\u446c\u7ce1\u6c52\u4179, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u4bc8\u4c2b\u7043\uae87\u3d4b\u5fe1))))), var_2_CC:\u6198\uff55\u56bd\u8308\u4cd9), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_3_188:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u64f2\u5f50\u56bd\u0b8e\u67d0\u98a4() {
        var_2_F6 : \u6198\uff55\u56bd\u8308\u4cd9
        var_3_128 : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_F6 = invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u1187\uae5d\u8308\u527a\u51fa>(\u9255\u0c95\u4cd9\ube23\u760c::\uc3e3\uc3e3\ud4fe\u97e6\uc87f\ub83f), and:int(ldc:int(9283), ldc:int(4377)), and:int(ldc:int(28482), ldc:int(63)), xor:int(ldc:int(17478), ldc:int(17474)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uceb8\u5fe1\u4ab3\u5f50\ub7dc>(\u9255\u0c95\u4cd9\ube23\u760c::\u3d64\u92ff\u965f\ud171\ub83f\u7bad), ldc:int(9), and:int(ldc:int(16131), ldc:int(11)), xor:int(ldc:int(-28383), ldc:int(-28379)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u156b\u392e\u34df\u718f\u6ec6>(\u9255\u0c95\u4cd9\ube23\u760c::\u624e\u6cfe\ub1b9\u7d52\u4179\u5fe1), xor:int(ldc:int(13378), ldc:int(13383)), and:int(ldc:int(6739), ldc:int(24579)), xor:int(ldc:int(-23552), ldc:int(-23548)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:int(60), and:int(ldc:int(2203), ldc:int(29217)), xor:int(ldc:int(4101), ldc:int(4103)))))
            var_3_128 = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6d99\ubff1\u72f1\u9255\ubded\ub32d, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\u156b\u494c\u9937\u92ee\u34df\u52d3)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u69d9\u5bc4\u34df\u3d4b\u6b5f\u416d)), getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee), getstatic:\u760c\ubded\uff55\u6d69\u4179<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u873d\u183a\u51fa\u5fe1\u51b2::\u97b7\ub18d\u760c\ub113\u6198\u516c)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ufe34\ub102\u8bb0\u965f\u0b8e\uc3e3)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u67e9\u7d52\u156b\ud12e\ub8be\u3711))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_3_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_3_128:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8350\uc2e8\u8413\u7c6b\u759a\u8df4)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u76bc\u416d\u0a06\u3bd6\u98a4\u718f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud7e8\uc910\u3776\u88c5\u8df4\u3a62)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc3e3\ubff1\u8640\u5bc4\ubff1\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8bb0\u92ee\u76bc\u6cfe\u647c\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc4d2\ua6bd\u8aa5\u76bc\u12cb\u927d)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub1b9\ud12e\u4975\ub113\ubff1\u3776)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u5fe1\u7af6\uafe7\u527a\ua61f\uc31c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u6bb9\u6cfe\uc29a\u5f50\u7af6\u61a4))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u97b7\u76bc\ua562\u1833\u7006, var_3_128:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud171\u97e6\u392e\u8389\u99f7\ud36e, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud4fe\u51fa\ud36e\u3dd3\u8709\u8389, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u8d90\u718f\u7330\u5fe1\uc4d2\u69d9, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(3343107)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), initobject:\u7049\u5fe1\u4179\u9937\ubded(\u7049\u5fe1\u4179\u9937\ubded::<init>, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u88c5\ud51e\uc2bd\uc910\u392e\u5654), ldc:float(0.025f))), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6cfe\ubff1\u8df4\u5245\u8c8a\uc910)), initobject:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u9a18\u6cfe\uc84e\u69d9\u6bb9\u120d), xor:int(ldc:int(-11255), ldc:int(-15495)), ldc:int(8), ldc:double(2.0))), initobject:\uae87\u36d3\uae87\u1187\u3dd3(\uae87\u36d3\uae87\u1187\u3dd3::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uafe7\uf94d\u67d0\u759a\u4d85\u4e72), ldc:double(0.0111))), invokestatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u7873\u40a9\u446c\u7ce1\u6c52\u4179, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc31c\uc84e\u8df4\u7bad\u2dcc\ud7e8))))), var_2_F6:\u6198\uff55\u56bd\u8308\u4cd9), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_3_128:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub32d\uafe7\u8753\u9a18\u3504\u6bb9() {
        var_2_BB : \u6198\uff55\u56bd\u8308\u4cd9
        var_3_ED : \u67d0\u9a18\u6ec6\u8aa5\u1187
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_BB = invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\ua6bd\u4975\uc7fe\u3711\u8350::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, invokevirtual:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::\u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d, initobject:\ua6bd\u4975\uc7fe\u3711\u8350(\ua6bd\u4975\uc7fe\u3711\u8350::<init>), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u64ab\u6c52\u6bb9\u600f\u5f50\u7bad), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u3776\ua562\uc3e3\u92ff>(\u9255\u0c95\u4cd9\ube23\u760c::\uceb8\u6ec6\uf995\ub83f\ud523\u99f7), xor:int(ldc:int(10624), ldc:int(10625)), xor:int(ldc:int(-28538), ldc:int(-28542)), and:int(ldc:int(2148), ldc:int(4)))), getstatic:\u51b2\u8640\u446c\ufcaf\u2dcc(\u51b2\u8640\u446c\ufcaf\u2dcc::\u62da\u4e72\u8308\ud158\u4f4a\u92ee), initobject:\u624e\u0b8e\ud158\ud158\ubf56(\u624e\u0b8e\ud158\ud158\ubf56::<init>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub113\ub171\u7873\u0800\u836c>(\u9255\u0c95\u4cd9\ube23\u760c::\u8d90\ub113\u4975\u3dd3\uceb8\u16f6), ldc:int(60), and:int(ldc:int(13491), ldc:int(321)), xor:int(ldc:int(-32415), ldc:int(-32413)))), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u3776\ua562\uc3e3\u92ff>(\u9255\u0c95\u4cd9\ube23\u760c::\uceb8\u6ec6\uf995\ub83f\ud523\u99f7), ldc:double(1.0), ldc:double(0.12)))
            var_3_ED = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6d99\ubff1\u72f1\u9255\ubded\ub32d, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u6c56\u92ff\u72f1\u760c\uceb8\u960f, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\uc229\ub83f\ub113\u8c8a\u0b8e\u7c6b)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ufe34\ub102\u8bb0\u965f\u0b8e\uc3e3)), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u69d9\u5bc4\u34df\u3d4b\u6b5f\u416d)), getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee), getstatic:\u760c\ubded\uff55\u6d69\u4179<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u873d\u183a\u51fa\u5fe1\u51b2::\u97b7\ub18d\u760c\ub113\u6198\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u67e9\u7d52\u156b\ud12e\ub8be\u3711))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\uceb8\ua3b4\u873d\ub102\u6bb9\u8258, var_3_ED:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_3_ED:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8350\uc2e8\u8413\u7c6b\u759a\u8df4)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u76bc\u416d\u0a06\u3bd6\u98a4\u718f)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud12e\uff55\u40a9\ube23\u12b2\u97b7)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ud7e8\uc910\u3776\u88c5\u8df4\u3a62)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc3e3\ubff1\u8640\u5bc4\ubff1\u516c)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u8bb0\u92ee\u76bc\u6cfe\u647c\u4975)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc4d2\ua6bd\u8aa5\u76bc\u12cb\u927d)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ubb2b\u4bc8\u5654\ub8be\uae87\ud217)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\uc29a\uf94d\ufe34\u3504\u4ab3\u56bd)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ube23\u4975\u1187\u8350\u4c04\u8753)), getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71f1\u416d\u0800\u76bc\u8c8a\u4bc8), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\ub18d\u7006\u3c25\u3504\u8753\u760c))
            invokestatic:void(\u4975\ub1b9\u4e72\u494c\uc31c::\u071d\u97b7\u76bc\ua562\u1833\u7006, var_3_ED:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d)), ldc:float(0.1f)), ldc:float(0.2f)), ldc:float(2.0f)), ldc:float(0.0f)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\u8d90\ub102\ua6bd\u5d20\ubded::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud171\u97e6\u392e\u8389\u99f7\ud36e, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u62da\ub19c\u527a\u4ab3\uae5d\u7330, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\ud4fe\u51fa\ud36e\u3dd3\u8709\u8389, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u8d90\u718f\u7330\u5fe1\uc4d2\u69d9, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u7e3f\u8258\u88c5\uc29a\u7330\u3d4b, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u4179\u7006\u64ab\u40a9\u97b7\u7873, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\u92ff\u8413\u40a9\u6fb0\u34df\ubcb0, invokevirtual:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::\uc3e3\ubefe\u6c56\u3c25\u8d98\ucef1, initobject:\u8d90\ub102\ua6bd\u5d20\ubded(\u8d90\ub102\ua6bd\u5d20\ubded::<init>), ldc:int(4159204)), ldc:int(329011)), ldc:int(1705242)), invokestatic:int(\ub113\u927d\u7c6b\ubefe\u71ae::\u7e3f\u67e9\ub32d\u7bad\uafe7\uc2bd, ldc:float(2.0f))), initobject:\u7049\u5fe1\u4179\u9937\ubded(\u7049\u5fe1\u4179\u9937\ubded::<init>, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u74b1\u946b\u6bb9\u6d69\u516c\ub32d), ldc:float(0.01428f))), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ub32d\u6b5f\u8413\u8413\uc29a\ua6bd)), initobject:\u64ab\u7006\u385b\ua3b4\u4e72(\u64ab\u7006\u385b\ua3b4\u4e72::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6435\ub171\u759a\u071d\uae5d\ub1b9), xor:int(ldc:int(-28639), ldc:int(-30895)), ldc:int(8), ldc:double(2.0))), initobject:\uae87\u36d3\uae87\u1187\u3dd3(\uae87\u36d3\uae87\u1187\u3dd3::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u61a4\u392e\uf94d\ufcaf\u99f7\u74b1), ldc:double(0.0111))), invokestatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u7873\u40a9\u446c\u7ce1\u6c52\u4179, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ud36e\u6c52\uc246\u7873\ufcaf\u8c8a))))), var_2_BB:\u6198\uff55\u56bd\u8308\u4cd9), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_3_ED:\u67d0\u9a18\u6ec6\u8aa5\u1187))))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u7bad\u4f52\u8df4\u4492\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6CE : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6C3 = and:int(ldc:int(-1452965544), ldc:int(-1311438264))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u927d\u7c6b\ubefe\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(311025468))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1015063821))
            var_5_8A = and:int(ldc:int(9789), ldc:int(-26302))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5011), ldc:int(-21400)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C3:int, ldc:int(-176868483))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(10945), ldc:int(39)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(24595), ldc:int(6185)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_E3:int, ldc:int(-2124603405))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(9239), ldc:int(4097)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1738200771))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-866802367))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-553531847))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(263079237))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1621231761))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1476207758))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(705354751))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1349596521))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-990879985))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-628498252))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-922761405))
                        var_11_F4 = and:int(ldc:int(-6540), ldc:int(6537))
                        goto(Label_1580)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1657893790))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1818406561))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1818987942))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1847249057))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-169200572))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-657648637))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-402953794))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1063078537))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1804611672))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2125497755))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1373261056))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-681661012))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1801715028))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1849273864))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-599285312))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-23550), ldc:int(-23549))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1890690732))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(366788368))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-200850335))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1470149067))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-951308209))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1333971175))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1973476408))
                        var_11_F4 = and:int(ldc:int(1726), ldc:int(-3775))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2027873003))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1844400111))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2024281135))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1916746523))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1722848923))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(405699392))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-34763226))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2034078062))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1326583985))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1830322064))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-364401226))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1104869528))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-468063670))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(553971700))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1317263216))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1976300652))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-183391588))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1715083168))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1544393508))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-460362639))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1115807408))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-615007235))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-496559001))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(343857535))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-145243797))
                        var_17_6CE = add:int(var_16_122:int, and:int(ldc:int(1537), ldc:int(149)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1347208383))
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1512609923))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, and:int(ldc:int(29697), ldc:int(2307))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-782453554))
            goto(Label_0108)
        }
    }
}
