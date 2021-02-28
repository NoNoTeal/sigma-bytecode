public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u6d69\ub7dc\uc7fe\uceb8\u8258 {
    public void \u6d69\ub7dc\uc7fe\uceb8\u8258(\u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 p0) {
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
            invokespecial:Object(Object::<init>, this:\u6d69\ub7dc\uc7fe\uceb8\u8258)
            putfield:\u7bad\u71ae\ua61f\ub102\u8413(\u6d69\ub7dc\uc7fe\uceb8\u8258::\u51fa\uc229\u494c\u92ff\u3504\u7873, this:\u6d69\ub7dc\uc7fe\uceb8\u8258, p0:\u7bad\u71ae\ua61f\ub102\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<com.mojang.authlib.GameProfile> \u61a4\u5245\u4ab3\u40a9\u8709\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_4_68 : List<\u51fa\u6c52\u7330\u7330\u960f>
        var_5_7C : ArrayList
        var_6_85 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        
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
        var_4_68 = invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\u7bad\u71ae\ua61f\ub102\u8413::\uc246\u4492\u92ff\u927d\ubff1\u7043, getfield:\u7bad\u71ae\ua61f\ub102\u8413(\u6d69\ub7dc\uc7fe\uceb8\u8258::\u51fa\uc229\u494c\u92ff\u3504\u7873, this:\u6d69\ub7dc\uc7fe\uceb8\u8258), p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_4_68:List<\u51fa\u6c52\u7330\u7330\u960f>))) {
            var_5_7C = invokestatic:ArrayList(Lists::newArrayList)
            var_6_85 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, var_4_68:List<\u51fa\u6c52\u7330\u7330\u960f>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_85:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                invokeinterface:boolean(List<GameProfile>::add, var_5_7C:ArrayList<GameProfile>[expected:List<GameProfile>], invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_6_85:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))))
            }
            
            return:Collection<GameProfile>(var_5_7C:ArrayList<GameProfile>)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u600f\u9937\ub8be\ud171\u624e::\uc238\ub6ab\u416d\u6cfe\ua61f\ub171)))
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
    
    public void \u8413\u6fb0\u600f\u8df4\uc2e8\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_619 : int
        
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
        var_3_60E = and:int(ldc:int(477535197), ldc:int(-805908259))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\ub7dc\uc7fe\uceb8\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_60E = and:int(var_3_60E:int, ldc:int(1559392991))
            var_5_7D = and:int(ldc:int(-30468), ldc:int(30467))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28052), ldc:int(-28053)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60E:int, ldc:int(1316915165))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(9369), ldc:int(22593)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(24), ldc:int(25)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60E = and:int(var_3_CA:int, ldc:int(-562316033))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(641), ldc:int(20565)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(296741684))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-580616949))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(544017311))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1119073092))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(448462277))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1132919329))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-849333954))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-494653191))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-2144220437))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1927257851))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-58858019))
                            var_11_DB = and:int(ldc:int(20874), ldc:int(-20875))
                            goto(Label_1435)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-37275207))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-619561741))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(628640046))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(950341876))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(84195309))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-277589763))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1200226342))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(989881932))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(328423435))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1745477139))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1048187135))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-414498320))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(730705499))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(464671512))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1706498847))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1046409304))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1145331672))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1740206164))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(787484895))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(144), ldc:int(145))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-746692362))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1430363128))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1609988351))
                        var_11_DB = and:int(ldc:int(-3385), ldc:int(3128))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-17001696))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1469721692))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1279858011))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(980709073))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-542246448))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2121770493))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-929938613))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(153357024))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1984710081))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(75988018))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1244551082))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-853571456))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1367610657))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1435)
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-2074410514))
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-296542867))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-763170135))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1309645714))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2047705928))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60E = and:int(var_3_60E:int, ldc:int(1853722621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1435:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_619 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1446:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1882117265))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(493694560))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1843854592))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-302202401))
                        var_17_619 = add:int(var_16_109:int, and:int(ldc:int(12385), ldc:int(19205)))
                        looporswitchbreak()
                    }
                    
                    var_3_60E = and:int(var_3_60E:int, ldc:int(-32392268))
                }
                
                var_3_60E = and:int(var_3_60E:int, ldc:int(2113356797))
                
                if (cmple:boolean(var_5_7D = var_17_619:int, sub:int(var_6_84:int, and:int(ldc:int(16905), ldc:int(257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
