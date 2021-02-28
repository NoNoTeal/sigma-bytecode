public class \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\u960f\u873d\ud7e8\u718f {
    public void \u6b0d\u960f\u873d\ud7e8\u718f() {
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
            invokespecial:Object(Object::<init>, this:\u6b0d\u960f\u873d\ud7e8\u718f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uceb8\uc2e8\u759a\u3d64\u5db4(java.util.List<\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e> p0) {
        var_3_81 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        expr_84 : \u0c95\u97b7\ud523\ub171\u0b8e[] [generated]
        var_5_115 : \u0c95\u97b7\ud523\ub171\u0b8e[]
        var_6_11A : int
        var_7_123 : int
        
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
        
        if (cmpgt:boolean(invokeinterface:int(List::size, p0:List), ldc:int(0))) {
            var_3_81 = getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u0c95\u97b7\ud523\ub171\u0b8e::\u6ec6\u9033\u873d\u8413\u446c, checkcast:\u0c95\u97b7\ud523\ub171\u0b8e(\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e.class, invokeinterface:\u0c95\u97b7\ud523\ub171\u0b8e(List<\u0c95\u97b7\ud523\ub171\u0b8e>::get, p0:List<\u0c95\u97b7\ud523\ub171\u0b8e>, and:int(ldc:int(-30129), ldc:int(30112)))))
            expr_84 = newarray:\u0c95\u97b7\ud523\ub171\u0b8e[](\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e.class, ldc:int(6))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(-3656), ldc:int(3591)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], xor:int(ldc:int(802), ldc:int(803)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(1034), ldc:int(6418)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(18511), ldc:int(8339)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], xor:int(ldc:int(8281), ldc:int(8285)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
            storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(10919), ldc:int(1285)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, var_3_81:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f)))
            var_5_115 = expr_84:\u0c95\u97b7\ud523\ub171\u0b8e[]
            var_6_11A = arraylength:int(var_5_115:\u0c95\u97b7\ud523\ub171\u0b8e[])
            var_7_123 = and:int(ldc:int(3907), ldc:int(-12228))
            
            while (cmplt:boolean(var_7_123:int, var_6_11A:int)) {
                if (cmpne:boolean(invokestatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u4c2b\u3bd6\u385b\uc7fe\u8640::\u5654\u965f\u873d\ud171\uf995, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u0c95\u97b7\ud523\ub171\u0b8e::\u6ec6\u9033\u873d\u8413\u446c, loadelement:\u0c95\u97b7\ud523\ub171\u0b8e(var_5_115:\u0c95\u97b7\ud523\ub171\u0b8e[], var_7_123:int))), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))) {
                    return:boolean(and:int[expected:boolean](ldc:int(2081), ldc:int(267)))
                }
                
                inc:int(var_7_123, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-11177), ldc:int(11016)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(4210), ldc:int(-12667)))
    }
    
    public static java.util.List<\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e> \u8bb0\u8df4\u3c25\u1833\uc229(java.util.List<\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e> p0) {
        var_1_5F : int
        var_3_67 : ArrayList<\u0c95\u97b7\ud523\ub171\u0b8e>
        var_4_76 : int
        
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
            var_1_5F = and:int(ldc:int(458127002), ldc:int(-1623632514))
            var_3_67 = initobject:ArrayList<\u0c95\u97b7\ud523\ub171\u0b8e>(ArrayList<E>::<init>)
            var_4_76 = sub:int(invokeinterface:int(List::size, p0:List), and:int(ldc:int(12629), ldc:int(1155)))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1888655682))
                
                if (cmplt:boolean(var_4_76:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u0c95\u97b7\ud523\ub171\u0b8e>::add, var_3_67:ArrayList<\u0c95\u97b7\ud523\ub171\u0b8e>[expected:List<\u0c95\u97b7\ud523\ub171\u0b8e>], invokeinterface:\u0c95\u97b7\ud523\ub171\u0b8e(List<\u0c95\u97b7\ud523\ub171\u0b8e>::get, p0:List<\u0c95\u97b7\ud523\ub171\u0b8e>, var_4_76:int))
                inc:int(var_4_76, ldc:int(-1))
            }
            
            return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(var_3_67:ArrayList<\u0c95\u97b7\ud523\ub171\u0b8e>[expected:List<\u0c95\u97b7\ud523\ub171\u0b8e>])
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e> \u527a\u8709\uc2bd\ubff1\u6ec6(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
        var_3_78 : int
        var_5_67 : ArrayList<Object>
        var_3_D8 : int
        expr_DB : \u0c95\u97b7\ud523\ub171\u0b8e[] [generated]
        var_6_168 : \u0c95\u97b7\ud523\ub171\u0b8e[]
        var_7_16C : \u0c95\u97b7\ud523\ub171\u0b8e[]
        var_8_171 : int
        var_9_17A : int
        var_10_1B2 : \u0c95\u97b7\ud523\ub171\u0b8e
        var_3_206 : int
        var_7_1A4 : int
        var_8_1F2 : \u0c95\u97b7\ud523\ub171\u0b8e[]
        var_9_1F7 : int
        var_10_200 : int
        var_12_22F : List<\u0c95\u97b7\ud523\ub171\u0b8e>
        
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
        var_3_78 = and:int(ldc:int(862876310), ldc:int(-76895236))
        var_5_67 = initobject:ArrayList<Object>(ArrayList<E>::<init>)
        
        if (cmpne:boolean(p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
            if (cmpge:boolean(p2:int, ldc:int(0))) {
                goto(Label_0147)
            }
        }
        
        Label_0109:
        
        if (cmpeq:boolean(and:int(var_3_78:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_78 = and:int(var_3_78:int, ldc:int(-1410481705))
            goto(Label_0182)
        }
        
        if (cmpne:boolean(and:int(var_3_78:int, ldc:int(128)), ldc:int(0))) {
            return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(var_5_67:List<\u0c95\u97b7\ud523\ub171\u0b8e>)
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_3_78:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_78:int, ldc:int(524288)), ldc:int(0))) {
                var_3_78 = and:int(var_3_78:int, ldc:int(167613231))
                goto(Label_0109)
            }
            
            var_3_78 = and:int(var_3_78:int, ldc:int(-1209077611))
            
            if (logicalnot:boolean(invokestatic:boolean(\u4c2b\u3bd6\u385b\uc7fe\u8640::\ucef1\u4daf\u71f1\ub32d\u0a06, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(var_5_67:List<\u0c95\u97b7\ud523\ub171\u0b8e>)
            }
        }
        
        Label_0182:
        
        if (cmpne:boolean(and:int(var_3_78:int, ldc:int(32768)), ldc:int(0))) {
            var_3_78 = and:int(var_3_78:int, ldc:int(2035684215))
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_3_78:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_78 = and:int(var_3_78:int, ldc:int(1056515316))
            goto(Label_0109)
        }
        
        var_3_D8 = and:int(var_3_78:int, ldc:int(2077199781))
        expr_DB = newarray:\u0c95\u97b7\ud523\ub171\u0b8e[](\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e.class, ldc:int(6))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(1750), ldc:int(-1751)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f)))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(525), ldc:int(16387)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u6ec6\u5654\u927d\u3711\u92ee\u97b7, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], xor:int(ldc:int(132), ldc:int(134)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u7bad\u72f1\u7873\u5fe1\ua068, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(1347), ldc:int(2587)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc246\u76bc\u4daf\uf9c5\uc246\u416d, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], and:int(ldc:int(1028), ldc:int(16388)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u8df4\ub6ab\u8640\u5bc4\u62da\u416d, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)))
        storeelement:\u0c95\u97b7\ud523\ub171\u0b8e(expr_DB:\u0c95\u97b7\ud523\ub171\u0b8e[], xor:int(ldc:int(8224), ldc:int(8229)), initobject:\u0c95\u97b7\ud523\ub171\u0b8e(\u0c95\u97b7\ud523\ub171\u0b8e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)))
        var_6_168 = var_7_16C = expr_DB
        var_8_171 = arraylength:int(var_7_16C:\u0c95\u97b7\ud523\ub171\u0b8e[])
        var_9_17A = and:int(ldc:int(-23409), ldc:int(4976))
        
        while (cmplt:boolean(var_9_17A:int, var_8_171:int)) {
            var_10_1B2 = loadelement:\u0c95\u97b7\ud523\ub171\u0b8e(var_7_16C:\u0c95\u97b7\ud523\ub171\u0b8e[], var_9_17A:int)
            
            if (logicalnot:boolean(invokestatic:boolean(\u4c2b\u3bd6\u385b\uc7fe\u8640::\ucef1\u4daf\u71f1\ub32d\u0a06, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u0c95\u97b7\ud523\ub171\u0b8e::\u6ec6\u9033\u873d\u8413\u446c, var_10_1B2:\u0c95\u97b7\ud523\ub171\u0b8e)))) {
                invokeinterface:boolean(List<\u0c95\u97b7\ud523\ub171\u0b8e>::add, var_5_67:List<\u0c95\u97b7\ud523\ub171\u0b8e>, var_10_1B2:\u0c95\u97b7\ud523\ub171\u0b8e)
                return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(var_5_67:List<\u0c95\u97b7\ud523\ub171\u0b8e>)
            }
            
            inc:int(var_9_17A, ldc:int(1))
        }
        
        var_3_206 = and:int(var_3_D8:int, ldc:int(-202423162))
        var_7_1A4 = and:int(ldc:int(2433), ldc:int(25665))
        
        while (cmplt:boolean(var_7_1A4:int, p2:int)) {
            var_8_1F2 = var_6_168:\u0c95\u97b7\ud523\ub171\u0b8e[]
            var_9_1F7 = arraylength:int(var_8_1F2:\u0c95\u97b7\ud523\ub171\u0b8e[])
            var_10_200 = and:int(ldc:int(-14661), ldc:int(14660))
            
            loop {
                var_3_206 = and:int(var_3_206:int, ldc:int(-1152401497))
                
                if (cmpge:boolean(var_10_200:int, var_9_1F7:int)) {
                    var_3_206 = and:int(var_3_206:int, ldc:int(-1208338481))
                    inc:int(var_7_1A4, ldc:int(1))
                    looporswitchbreak()
                }
                
                var_12_22F = invokestatic:List<\u0c95\u97b7\ud523\ub171\u0b8e>(\u6b0d\u960f\u873d\ud7e8\u718f::\u527a\u8709\uc2bd\ubff1\u6ec6, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u0c95\u97b7\ud523\ub171\u0b8e::\u6ec6\u9033\u873d\u8413\u446c, loadelement:\u0c95\u97b7\ud523\ub171\u0b8e(var_8_1F2:\u0c95\u97b7\ud523\ub171\u0b8e[], var_10_200:int)), var_7_1A4:int)
                
                if (invokestatic:boolean(\u6b0d\u960f\u873d\ud7e8\u718f::\uceb8\uc2e8\u759a\u3d64\u5db4, invokestatic:List<\u0c95\u97b7\ud523\ub171\u0b8e>(\u6b0d\u960f\u873d\ud7e8\u718f::\u8bb0\u8df4\u3c25\u1833\uc229, var_12_22F:List<\u0c95\u97b7\ud523\ub171\u0b8e>))) {
                    invokeinterface:boolean(List<Object>::addAll, var_5_67:ArrayList<Object>[expected:List<Object>], var_12_22F:List<\u0c95\u97b7\ud523\ub171\u0b8e>[expected:Collection<?>])
                    return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(ternaryop:List<\u0c95\u97b7\ud523\ub171\u0b8e>(cmple:boolean(invokeinterface:int(List<E>::size, var_5_67:ArrayList<Object>[expected:List<Object>]), and:int(ldc:int(1025), ldc:int(18521))), var_5_67:List<\u0c95\u97b7\ud523\ub171\u0b8e>, invokestatic:List<\u0c95\u97b7\ud523\ub171\u0b8e>(\u6b0d\u960f\u873d\ud7e8\u718f::\u8bb0\u8df4\u3c25\u1833\uc229, var_5_67:ArrayList<Object>)))
                }
                
                inc:int(var_10_200, ldc:int(1))
            }
        }
        
        return:List<\u0c95\u97b7\ud523\ub171\u0b8e>(var_5_67:ArrayList<Object>)
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
    
    public void \u156b\ubff1\uc9f6\u6b0d\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_671 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_67C : int
        
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
        var_3_671 = and:int(ldc:int(1783820373), ldc:int(-54038121))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b0d\u960f\u873d\ud7e8\u718f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
            var_3_671 = and:int(var_3_671:int, ldc:int(-300154963))
            var_5_7D = and:int(ldc:int(-847), ldc:int(846))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25095), ldc:int(-25352)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_671:int, ldc:int(-79495459))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(4641), ldc:int(4640)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(212), ldc:int(213)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_671 = and:int(var_3_D2:int, ldc:int(-928285083))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1029), ldc:int(1)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1372027535))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(2119080177))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1224101005))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1081682170))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1346786567))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1165305203))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1664224863))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-693837672))
                    }
                    else {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1537375909))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(542418246))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-2105794301))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-151867581))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-882116241))
                            var_11_E3 = and:int(ldc:int(-6430), ldc:int(6429))
                            goto(Label_1523)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-435079542))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(880764576))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1954468412))
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-727983382))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1868525957))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(70554653))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1243655003))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-855216328))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1787494343))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-814339275))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(852059117))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1692913337))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1794867103))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(1157), ldc:int(1156))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-275344451))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-826575250))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(92651251))
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1140881441))
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1641792738))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-175284716))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1212350309))
                        var_11_E3 = and:int(ldc:int(-13645), ldc:int(13580))
                    }
                    
                    Label_1083:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(102298117))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-508633665))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1559115989))
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1412111503))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-617327067))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1680939329))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-831358819))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1384)
                            }
                        }
                    }
                    
                    Label_1219:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-148013900))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1957496666))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(607702727))
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(160282546))
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-820771488))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-173707653))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(726681683))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-28381466))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-105940881))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1523)
                    }
                    
                    Label_1384:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1446512642))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1171601544))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1348701600))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-637872848))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(30054790))
                        loopcontinue()
                    }
                    
                    var_3_671 = and:int(var_3_671:int, ldc:int(1208154549))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1523:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1534:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-383896699))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(527409858))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1165115105))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-937419600))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-958181794))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-55083707))
                        var_17_67C = add:int(var_16_111:int, xor:int(ldc:int(16560), ldc:int(16561)))
                        looporswitchbreak()
                    }
                }
                
                var_3_671 = and:int(var_3_671:int, ldc:int(-668241145))
                
                if (cmple:boolean(var_5_7D = var_17_67C:int, sub:int(var_6_84:int, xor:int(ldc:int(2104), ldc:int(2105))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_671 = and:int(var_3_671:int, ldc:int(-2146865754))
            goto(Label_0106)
        }
    }
}
