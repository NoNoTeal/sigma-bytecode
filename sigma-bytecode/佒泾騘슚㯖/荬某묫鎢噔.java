public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u836c\u67d0\ubb2b\u93a2\u5654 {
    public void \u836c\u67d0\ubb2b\u93a2\u5654(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u760c\u3d4b\u62da\u3e75\u5bc4 p0, java.util.Map p1, java.util.Map p2) {
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
            putfield:\u760c\u3d4b\u62da\u3e75\u5bc4(\u836c\u67d0\ubb2b\u93a2\u5654::\u7049\u8709\ua6bd\u3e2a\uf94d, this:\u836c\u67d0\ubb2b\u93a2\u5654, p0:\u760c\u3d4b\u62da\u3e75\u5bc4)
            putfield:Map(\u836c\u67d0\ubb2b\u93a2\u5654::\uae5d\u516c\u61a4\u88c5\u8c8a, this:\u836c\u67d0\ubb2b\u93a2\u5654, p1:Map)
            putfield:Map(\u836c\u67d0\ubb2b\u93a2\u5654::\ub18d\u5140\u3bd6\u5fe1\u760c, this:\u836c\u67d0\ubb2b\u93a2\u5654, p2:Map)
            invokespecial:Object(Object::<init>, this:\u836c\u67d0\ubb2b\u93a2\u5654)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        var_3_6E : Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>
        var_4_BD : Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>
        var_4_12F : Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>
        
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
            var_1_5F = and:int(ldc:int(315749226), ldc:int(1523185582))
            var_3_6E = invokeinterface:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>(Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>::iterator, invokeinterface:Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>::entrySet, getfield:Map(\u836c\u67d0\ubb2b\u93a2\u5654::\uae5d\u516c\u61a4\u88c5\u8c8a, this:\u836c\u67d0\ubb2b\u93a2\u5654)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0262)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-805405393))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6E:Iterator)) {
                        var_4_BD = checkcast:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>(java.util.Map.Entry<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>.class, invokeinterface:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>(Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>::next, var_3_6E:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>))
                        
                        if (cmpne:boolean(invokeinterface:V(Entry<K, V>::getValue, var_4_BD:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>), aconstnull:V())) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-612305026))
                            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>::getKey, var_4_BD:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>)), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u1187\u6b0d\ud217\u34df\u7043::\uc87f\u88c5\ud7e8\ub8be\u3dd3, checkcast:\u1187\u6b0d\ud217\u34df\u7043(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1187\u6b0d\ud217\u34df\u7043.class, invokeinterface:V(Entry<K, V>::getValue, var_4_BD:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>))))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                    }
                }
                
                Label_0139:
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-810057798))
                    var_3_6E = invokeinterface:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>(Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>::iterator, invokeinterface:Set<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>::entrySet, getfield:Map(\u836c\u67d0\ubb2b\u93a2\u5654::\ub18d\u5140\u3bd6\u5fe1\u760c, this:\u836c\u67d0\ubb2b\u93a2\u5654)))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_3_6E:Iterator)) {
                        var_4_12F = checkcast:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>(java.util.Map.Entry<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>.class, invokeinterface:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>(Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>::next, var_3_6E:Iterator<Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, V>>))
                        
                        if (cmpne:boolean(invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::getValue, var_4_12F:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>), aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(1065514478))
                            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::getKey, var_4_12F:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)), checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::getValue, var_4_12F:Entry<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)))
                        }
                    }
                }
                
                Label_0262:
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-488673711))
                    goto(Label_0139)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
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
    
    public void \ub7dc\u36d3\u392e\u64f2\ub8be(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F7 : int
        
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
        var_3_5EC = and:int(ldc:int(1904011391), ldc:int(-44437506))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u836c\u67d0\ubb2b\u93a2\u5654[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-684691524))
        }
        else {
            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1420038915))
            var_5_85 = and:int(ldc:int(2451), ldc:int(-3060))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30259), ldc:int(-30324)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5EC:int, ldc:int(2037905514))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32752), ldc:int(-32751)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2213), ldc:int(16449)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5EC = and:int(var_3_D2:int, ldc:int(-1183457176))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(10), ldc:int(11)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1973786602))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-948459018))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1676731275))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-284485432))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1858025375))
                    }
                    else {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-444597791))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(79709988))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(936704750))
                            var_11_E3 = and:int(ldc:int(4367), ldc:int(-21776))
                            goto(Label_1401)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1359229690))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1038836166))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-454461811))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1684334175))
                            loopcontinue()
                        }
                        
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1911419758))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1912551093))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1000444516))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-632445365))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1834482158))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(950218462))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1946442195))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(532825380))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1833886967))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(1536), ldc:int(1537))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0849:
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1588673887))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1045097575))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-2060316977))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-216692180))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(492848232))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(1393534915))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-2009319624))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(1192051389))
                            loopcontinue()
                        }
                        
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1183522324))
                        var_11_E3 = and:int(ldc:int(-17697), ldc:int(17696))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-279078659))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-774773452))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(2043753667))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(1831054683))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-411306399))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1829924650))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(121519714))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(395460009))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1542839925))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1453985941))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1401)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1996124428))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-821490065))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-803393053))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-1242637591))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(836333300))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1876744072))
                        loopcontinue()
                    }
                    
                    var_3_5EC = and:int(var_3_5EC:int, ldc:int(1029892987))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1401:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1412:
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(996403790))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-667898992))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(1829952495))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(333300099))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EC = and:int(var_3_5EC:int, ldc:int(-67834252))
                        var_17_5F7 = add:int(var_16_111:int, xor:int(ldc:int(1026), ldc:int(1027)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5EC = and:int(var_3_5EC:int, ldc:int(567140456))
                
                if (cmple:boolean(var_5_85 = var_17_5F7:int, sub:int(var_6_8C:int, xor:int(ldc:int(4117), ldc:int(4116))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5EC:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
