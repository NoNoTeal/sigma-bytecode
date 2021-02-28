public final class \u6435\ub8be\u718f\u6b0d\u67e9.\ud523\u51fa\u6c56\u416d\ub102\ud51e {
    public void \ud523\u51fa\u6c56\u416d\ub102\ud51e(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0) {
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
            invokespecial:\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8(\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8::<init>, this:\ud523\u51fa\u6c56\u416d\ub102\ud51e, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56> \u6c56\u183a\uc246\u760c\u51fa\u36d3(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0, java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56> p1) {
        var_3_7E : int
        var_5_68 : CopyOnWriteArrayList<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>
        var_6_71 : Iterator<Object>
        var_7_AE : \u5245\u3504\uc31c\ubefe\u4f4a\u6c56
        
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
            var_3_7E = and:int(ldc:int(-1079461106), ldc:int(-1485908350))
            var_5_68 = initobject:CopyOnWriteArrayList<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(CopyOnWriteArrayList<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>::<init>, p1:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>[expected:Collection<? extends \u5245\u3504\uc31c\ubefe\u4f4a\u6c56>])
            var_6_71 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_5_68:List<Object>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_7E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_7E = and:int(var_3_7E:int, ldc:int(-138609754))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_71:Iterator<Object>)) {
                        var_7_AE = checkcast:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56.class, invokeinterface:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>::next, var_6_71:Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>))
                        
                        if (cmpge:boolean(invokevirtual:int(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\u7006\ub8be\u97e6\u51b2\u6cfe\u120d, var_7_AE:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56), xor:int(ldc:int(272), ldc:int(277)))) {
                            invokevirtual:void(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\ucfaf\uc7fe\u8c8a\u6bb9\uf995\u7006, var_7_AE:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56, add:int(invokevirtual:int(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\u7006\ub8be\u97e6\u51b2\u6cfe\u120d, var_7_AE:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56), xor:int(ldc:int(2248), ldc:int(2249))))
                        }
                        
                        var_3_7E = and:int(var_3_7E:int, ldc:int(-944142834))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_7E:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_7E = and:int(var_3_7E:int, ldc:int(881716102))
            }
            
            return:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(var_5_68:CopyOnWriteArrayList<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u6c56\u183a\uc246\u760c\u51fa\u36d3(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0, java.lang.Object p1) {
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
            return:Object(invokevirtual:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>[expected:Object](\ud523\u51fa\u6c56\u416d\ub102\ud51e::\u6c56\u183a\uc246\u760c\u51fa\u36d3, this:\ud523\u51fa\u6c56\u416d\ub102\ud51e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, checkcast:List(java.util.List.class, p1:Object[expected:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>])))
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
    
    public void \u839e\u6bb9\u494c\u71f1\uc238\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(38088489), ldc:int(-470954185))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud523\u51fa\u6c56\u416d\ub102\ud51e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1552323289))
            var_5_7D = and:int(ldc:int(-1648), ldc:int(1099))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22913), ldc:int(-22914)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60D:int, ldc:int(-634581889))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(2181), ldc:int(2180)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(4613), ldc:int(27)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_CA:int, ldc:int(263003967))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(29), ldc:int(1345)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1766641982))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1028924134))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1113541494))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(320817089))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1007239738))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1487869643))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2052455857))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-148324976))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1845190143))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1926277030))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1763769523))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1930018212))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1494290346))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1777505225))
                            var_11_DB = and:int(ldc:int(-9119), ldc:int(8590))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-139156333))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-439854225))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(586313992))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(291593556))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(453502091))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-444303161))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2131293309))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(790600999))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1658207389))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1690413905))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1728282555))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1054778380))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-383484977))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1553419490))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-492888195))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(2117), ldc:int(2116))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1128690085))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1580176168))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(219576035))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1363457700))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1023566118))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-156402447))
                        var_11_DB = and:int(ldc:int(-22133), ldc:int(5732))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2128621285))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(904058266))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1376856933))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1493064574))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(983189757))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-558359574))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2013477807))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1599560805))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1968003259))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1198871687))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2079432234))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(923104951))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-498727076))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-80388123))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1439)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1785000560))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1615236972))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2117670080))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1746170511))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(476748151))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1061526121))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2120203639))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-541793338))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-135569665))
                        var_17_618 = add:int(var_16_109:int, and:int(ldc:int(9), ldc:int(25863)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(2060283891))
                
                if (cmple:boolean(var_5_7D = var_17_618:int, sub:int(var_6_84:int, and:int(ldc:int(1029), ldc:int(10241))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
